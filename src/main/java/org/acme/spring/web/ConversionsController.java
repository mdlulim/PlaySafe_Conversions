package org.acme.spring.web;

import javax.ws.rs.*;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ConversionsController {

    //Converting kelvin to celsius
    @POST
    @Path("/conversions/ktoc")
    public Conversion ktoc(Conversion kelvin) {

        float celsius = kelvin.getKelvin() - 273.15F;
        Conversion convert= new Conversion();
        convert.setCelsius(celsius);

        return convert;
    }

     //Converting celsius to kelvin
     @POST
     @Path("/conversions/ctok")
     public Conversion ctok(Conversion celsius) {
         float kelvin = (float) (273.15 + celsius.getCelsius());
         Conversion convert= new Conversion();
         convert.setCelsius(kelvin);

         return convert;
     }

     //Converting miles to kilometers
     @POST
     @Path("/conversions/mtok")
     public Conversion mtok(Conversion miles) {
         float kilometers = (float) (miles.getMiles() / 0.62137);
         Conversion convert= new Conversion();
         convert.setKilometers(kilometers);

         return convert;
     }
}