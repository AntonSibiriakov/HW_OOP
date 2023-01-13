public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;



    Car(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = "default";
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;

        if (brand == null || brand.isBlank()) {
            this.brand = "default";
        }

        if (model == null || model.isBlank()) {
            this.model = "default";
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        }
        if (color.isBlank()) {
            this.model = "white";
        }
        if (year <= 0) {
            this.year = 2000;
        }
        if (country.isBlank()) {
            this.country = "default";
        }
    }

    public String toString() {
        return brand+" "+model+" "+ engineVolume+" "+ color+" "+year+" "+ country;

    }

}
