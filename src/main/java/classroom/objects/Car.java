package classroom.objects;

public class Car {
    String model;
    int doors;
    boolean isFourWheelDrive;
    String color;
    double consumption;

    public Car(String model, int doors, boolean isFourWheelDrive, String color, double consumption) {
        this.model = model;
        this.doors = doors;
        this.isFourWheelDrive = isFourWheelDrive;
        this.color = color;
        this.consumption = consumption;
    }

    public Car() {
    }
}
