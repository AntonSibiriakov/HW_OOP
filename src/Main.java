import transport.*;

public class Main {


    public static void main(String[] args) {

        DriverB[] driverB = new DriverB[4];
        driverB[0]=new DriverB("Иванов Сергей Александрович",true, 2);
        driverB[1]=new DriverB("Ерофеев Михаил Даниилович",true, 6);
        driverB[2]=new DriverB("Королев Даниил Тимурович",true, 3);
        driverB[3]=new DriverB("Николаев Артур Ильич",true, 4);



        Car[] car = new Car[4];
        car[0]= new Car("Toyota", "GT86", 1.6,driverB[0]);
        car[1]= new Car("Nissan", "Skyline", 1.8,driverB[1]);
        car[2]=new Car("Mitsubishi", "Evo", 1.9,driverB[2]);
        car[3]=new Car("Porsche", "911", 1.9,driverB[3]);



        DriverC[] driverC = new DriverC[4];
        driverC[0]=new DriverC("Семенов Илья Александрович",true, 2);
        driverC[1]=new DriverC("Демидов Максим Андреевич",true, 5);
        driverC[2]=new DriverC("Кузнецов Андрей Михайлович",true, 6);
        driverC[3]=new DriverC("Ершов Максим Максимович",true, 4);



        FreightCar[] freightCars = new FreightCar[4];
        freightCars[0]=new FreightCar("Hyundai", "Gold", 7,driverC[0]);
        freightCars[1]=new FreightCar("Iveco", "EuroCargo", 5.9,driverC[1]);
        freightCars[2]=new FreightCar("Mercedes-Benz", "Actros", 12,driverC[2]);
        freightCars[3] = new FreightCar("Isuzu", "Forward", 5.2,driverC[3]);



        DriverD[] driverD = new DriverD[4];
        driverD[0]=new DriverD("Бычков Артём Александрович",true, 5);
        driverD[1]=new DriverD("Тарасов Станислав Ильич",true,2 );
        driverD[2]=new DriverD("Беляков Денис Даниилович",true,5 );
        driverD[3]=new DriverD("Филимонов Игорь Викторович",true, 7);



        Bus[] bus = new Bus[4];
        bus[0] = new Bus("Peugeot", "Boxer", 2.2,driverD[0]);
        bus[1] = new Bus("Mercedes-Benz", "Sprinter", 3.0,driverD[1]);
        bus[2] = new Bus("Golden Dragon", "XML6957", 6.7,driverD[2]);
        bus[3] = new Bus("Ford", "Transit", 2.2,driverD[3]);



        printArr(car);
        printArr(freightCars);
        printArr(bus);

    }
    public static void printArr(Transport[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i].printDriverCar();
            a[i].allData();
        }

    }
}