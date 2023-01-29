package transport;

public class Driver {
    final private String fullName;
   private boolean drivingLicense;
    private int experience;

    public Driver(String fullName, boolean drivingLicense, int experience) {
        this.fullName = fullName;
        this.drivingLicense = drivingLicense;
        this.experience = experience;
    }

    public void setDrivingLicense(boolean drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getFullName() {
        return fullName;
    }

    public boolean getDrivingLicense() {
        return drivingLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void driverStart() {
        System.out.println("Водитель "+getFullName() +" начал гонку");
    }
    public void driverStop() {
        System.out.println("Водитель "+ getFullName()+" остановился");
    }

    public void driverRefuelCar() {
        System.out.println("Водитель "+ getFullName()+" заправляет авто");
    }
}
