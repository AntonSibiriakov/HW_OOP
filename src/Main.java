import transport.Bus;
import transport.Car;

public class Main {


    public static void main(String[] args) {


        Bus m5 = new Bus("Toyota", "m5", 2015, "Japan", "Red", 180);
        Bus t4 = new Bus("Volkswagen", "е4", 2010, "Germany", "White", 160);
        Bus primastar = new Bus("Nissan", "Primastar", 2020, "Japan", "Yellow", 175);
        System.out.println(m5.toString());
        System.out.println(t4.toString());
        System.out.println(primastar.toString());



    }
}