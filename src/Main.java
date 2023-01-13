public class Main {


    public static void main(String[] args) {
        Car ladaGranta = new Car("Lada", "Granta", 1.7, "yellow", 2015, "Russia");
        Car audiA8 = new Car("Audi", "A8", 3, "black", 2020, "Germany");
        Car BMWZ8 = new Car("BMW", "Z8", 3, "black", 2021, "Germany");
        Car KiaSportage = new Car("Kia", "Sportage", 2.4, "red", 2018, "South Korea");
        Car hyundaiAvante = new Car("Hyundai", "Avante", 1.6, "orange", 2016, "South Korea");
        System.out.println(ladaGranta.toString());
        System.out.println(audiA8.toString());
        System.out.println(BMWZ8.toString());
        System.out.println(KiaSportage.toString());
        System.out.println(hyundaiAvante.toString());
    }
}