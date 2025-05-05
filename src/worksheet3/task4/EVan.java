package worksheet3.task4;

public class EVan extends Vehicle implements Electrified {
    // TODO: add attributes , constants and implement required methods
    public EVan(String id, double maxLoad, double batteryCapacity) {
        super(id, maxLoad);
// TODO: initialise attributes
    }
// TODO: implement Vehicle + Electrified methods

    @Override
    public double fuelNeeded(double distance) {
        return 0;
    }

    @Override
    public double getRange() {
        return 0;
    }

    @Override
    public double getBatteryLevel() {
        return 0;
    }

    @Override
    public void charge(double kWh) {

    }
}
