package org.acme.spring.web;

public class Conversion {
    private float kelvin;
    private float celsius;
    private float miles;
    private float kilometers;

    public float getKelvin(){
        return kelvin;
    }
    public float getCelsius(){
        return celsius;
    }

    public float getMiles(){
        return miles;
    }

    public float getKilometers(){
        return kilometers;
    }

    public void setKelvin(float kelvin){
        this.kelvin = kelvin;
    }
    public void setCelsius(float celsius){
        this.celsius = celsius;
    }

    public void setMiles(float miles){
        this.miles = miles;
    }

    public void setKilometers(float kilometers){
        this.kilometers = kilometers;
    }

}