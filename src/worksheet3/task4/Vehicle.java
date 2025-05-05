package worksheet3.task4;

public abstract class Vehicle {
    protected String id;
    protected double maxLoad; // kg
    public Vehicle(String id, double maxLoad) {
        this.id = id;
        this.maxLoad = maxLoad;
    }
    /** @return maximum distance (km) the vehicle can travel with
     * current energy */
    public abstract double getRange();
    /** @return fuel (or energy) needed in litres/kWh to drive
     * the given distance (km) */
    public abstract double fuelNeeded(double distance);
}
