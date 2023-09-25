package HW6.Ex2;

public class Bus extends Vehicle {
    public Bus(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.6;
    }
}
