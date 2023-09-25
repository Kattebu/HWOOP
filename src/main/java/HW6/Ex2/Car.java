package HW6.Ex2;

public class Car extends Vehicle {
    public Car(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.8;
    }
}
