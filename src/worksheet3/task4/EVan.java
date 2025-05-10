package worksheet3.task4;

public class EVan extends Vehicle implements Electrified {
    public EVan(String id, double maxLoad, double batteryCapacity) {
        super(id, maxLoad);
    }

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
