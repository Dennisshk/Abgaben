package worksheet3.task3;

public class Lamp implements Switchable, Dimmable {
    private boolean on;
    private int brightness;

    @Override
    public void turnOn() {
        on=true;
    }

    @Override
    public void turnOff() {
        on=false;
    }

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public void setBrightness(int level) {
        if(on&&level<=MAX_BRIGHTNESS && level>=0)brightness=level;
    }

    @Override
    public int getBrightness() {
        return brightness;
    }
}

