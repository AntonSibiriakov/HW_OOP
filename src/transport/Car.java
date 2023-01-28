package transport;

import java.util.Calendar;

public class Car {
    final private String brand;
    final private String model;
    private double engineVolume;
    private String color;
    final private int year;
    final private String country;
    private String transmission;
    final private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private boolean winterTires;
    String strTires = winterTires ? "Зимняя Резина" : "Летнаяя резина";


    public Car(String brand, String model, double engineVolume, String color, int year, String country,
               String transmission, String bodyType, String registrationNumber, int numberOfSeats, boolean winterTires) {


        if (brand == null || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (color == null || color.isBlank()) {
            this.color = "white";
        } else {
            this.color = color;
        }

        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }

        if (country == null || country.isBlank()) {
            this.country = "default";
        } else {
            this.country = country;
        }

        if (transmission == null || transmission.isBlank()) {
            this.transmission = "Automatic transmission";
        } else {
            this.transmission = transmission;
        }

        if (bodyType == null || bodyType.isBlank()) {
            this.bodyType = "Sedan";

        } else {
            this.bodyType = bodyType;
        }

        if (registrationNumber == null || registrationNumber.isBlank()) {
            this.registrationNumber = "o000oo 11";
        } else {
            this.registrationNumber = registrationNumber;
        }

        if (numberOfSeats <= 0) {
            this.numberOfSeats = 5;
        } else {
            this.numberOfSeats = numberOfSeats;
        }

        if (winterTires = false) {
            changeTires();
        }
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfSeats() {

        return numberOfSeats;
    }

    public boolean isWinterTitres() {
        return winterTires;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {

        return  brand + ' '+
                model +' '+
                engineVolume +' '+
                color +' '+
                year +' '+
                country+' '+
                transmission+' '+
                registrationNumber+' '+
                numberOfSeats+' '+
                strTires;
    }

    public void changeTires() {

            if (Calendar.MONTH < 4 && Calendar.MONTH > 10) {
                this.winterTires = true;
            }
         else {
            this.winterTires = false;
        }    }
    public class Key {
        final boolean remoteEngineStart;
        final boolean keylassAccess;

        private Key(boolean remoteEngineStart, boolean keylassAccess) {
            this.remoteEngineStart=remoteEngineStart;
            this.keylassAccess=keylassAccess;

            }
        }










    }





