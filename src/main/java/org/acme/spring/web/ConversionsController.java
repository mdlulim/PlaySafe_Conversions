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
}