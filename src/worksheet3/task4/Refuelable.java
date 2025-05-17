package worksheet3.task4;

public interface Refuelable {
    void refuel(double liters);
    double getFuelLevel();
    /**
     * Default helper: can the vehicle travel 'distance ' km with
     * current fuel?
     * Works for any Refuelable that also extends Vehicle.
     */
    default boolean canReach(double distance) {
        if (this instanceof Vehicle) {
            Vehicle v = (Vehicle)this;
            return v.getRange() >= distance;
        }
        return false;
    }
}

