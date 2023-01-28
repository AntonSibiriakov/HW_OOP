package transport;

import java.util.Calendar;

public class Car extends Transport {

    private double engineVolume;
    private String transmission;
    final private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private boolean winterTires;
    String strTires = winterTires ? "Зимняя Резина" : "Летнаяя резина";


    public Car(String brand, String model, double engineVolume, String color, int year, String country,
               String transmission, String bodyType, String registrationNumber, int numberOfSeats, boolean winterTires, int maxSpeed) {


        super(brand, model, year, country, color, maxSpeed);

        this.engineVolume = engineVolume;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.registrationNumber = registrationNumber;
        this.numberOfSeats = numberOfSeats;
        this.winterTires = winterTires;
    }



      public double getEngineVolumeCar() {
        return engineVolume;
    }



    public String getTransmissionCar() {
        return transmission;
    }

    public String getBodyTypeCar() {
        return bodyType;
    }

    public String getRegistrationNumberCar() {
        return registrationNumber;
    }

    public int getNumberOfSeatsCar() {

        return numberOfSeats;
    }

    public boolean getWinterTitresCar() {
        return winterTires;
    }

    public String getBrandCar () {
        return getBrand();
    }
    public String getModelCar(){
        return getModel();
    }
    public String getCountryCar() {

        return getCountry();
    }

    public String getColorCar() {

        return getColor();
    }

    public int getMaxSpeedCar() {

        return getMaxSpeed();
    }


    public void setEngineVolumeCar(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setTransmissionCar(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumberCar(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setNumberOfSeatsCar(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setColorCar(String color) {
        setColor(color);
    }

    public void setMaxSpeedCar(int maxSpeed) {
        setMaxSpeed(maxSpeed);
    }


   
    public String toStringCar() {

        return getBrand()+' '+getModel()+' '+getYear()+' '+getCountry()+' '+getColor()+' '+engineVolume +' '+ transmission+' '+ registrationNumber+' '+ numberOfSeats+' '+ strTires+' '+getMaxSpeed();
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





