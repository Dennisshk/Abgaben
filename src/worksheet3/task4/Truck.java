package worksheet3.task4;

public class Truck extends Vehicle implements Refuelable {
    private double fuelLevel;
    public Truck(String id, double maxLoad, double tankCapacity) {
        super(id, maxLoad);
        this.id=id;
        this.maxLoad=maxLoad;
        fuelLevel=tankCapacity;
    }

    @Override
    public double getRange() {
        return 0;
    }

    @Override
    public double fuelNeeded(double distance) {
        return 0;
    }

    @Override
    public boolean canReach(double distance) {
        return Refuelable.super.canReach(distance);
    }

    @Override
    public void refuel(double liters) {

    }

    @Override
    public double getFuelLevel() {
        return fuelLevel;
    }
}

