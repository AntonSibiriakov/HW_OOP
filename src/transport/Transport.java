package transport;


public abstract class  Transport <T extends Driver> implements Competing  {
    final private String brand;
    final private String model;
    private T driver;

    private double engineVolume;

    public Transport(String brand, String model, double engineVolume,T driver) {
        this.brand = brand==null|| brand.isBlank()? "default": brand;
        this.model = model== null|| model.isBlank()?"default":model;
        this.engineVolume = engineVolume <= 0 ? 1 : engineVolume;
        setDriver(driver);



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

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public void transportStart() {
        System.out.println("Стартовал "+brand+' '+ model);
    }

    public void TransportFinish() {
        System.out.println("Финишировал"+ brand+' '+ model);
    }

    public void pitStop(){

        System.out.println("Пит-стоп " + brand + ' ' + model + "длился " + randomInt(14, 20));

    }

    public  void bestLapTime(){

        System.out.println("Лучшее время круга " + brand + ' ' + model + ' ' + randomInt(60, 80));
    }

    public void maxSpeed(){
        System.out.println("Максимальная скорость "+ brand+' '+model+' '+ randomInt(70,100));
    }


    @Override
    public String toString() {
        return brand +' '+ model +' '+ engineVolume;

    }

    public void allData() {
        System.out.println( "\n"+toString());
        pitStop();
        bestLapTime();
        maxSpeed();
    }

    private static int randomInt(int min, int max) {


        return (int)(min + (max-min) * Math.random());
    }

    public void printDriverCar() {
        System.out.println("водитель " +driver.getFullName()+ " управляет автомобилем "+this.brand+' '+ this.model +" и будет участвовать в заезде");
    }

}