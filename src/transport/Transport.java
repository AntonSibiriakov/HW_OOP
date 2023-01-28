package transport;

class Transport  {
    final private String brand;
    final private String model;
    final private int year;
    final private String country;
    private String color;
    private int maxSpeed;

    public Transport(String brand, String model, int year, String country, String color, int maxSpeed) {
        this.brand = checkingDataStr(brand);
        this.model = checkingDataStr(model);
        this.year = checkingDataYear(year);
        this.country = checkingDataStr(country);
        this.color = checkingDataStr(color);
        this.maxSpeed = checkingDataMaxSpeed(maxSpeed);
    }



    public String checkingDataStr(String a) {
        return a==null||a.isBlank()?"default": a;
    }

    public int checkingDataYear(int a) {
        return a<=0? 2000:a;
    }

    public int checkingDataMaxSpeed(int a) {
        return a<=0? 60:a;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setColor(String color) {
        this.color = checkingDataStr(color);
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = checkingDataMaxSpeed(maxSpeed);
    }

    @Override
    public String toString() {
        return brand +' '+ model + ' ' + year +' '+ country + ' ' + color + ' ' + maxSpeed;
    }
}
