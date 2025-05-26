package worksheet6.task5;

public abstract class BaseRobot implements ControllableRobot{
    private String name;
    private boolean running;

    public BaseRobot(String name){
        this.name=name;
    }

    @Override
    public abstract void performTask();

    @Override
    public void start() {
        running=true;
    }

    @Override
    public boolean isRunning() {
        return running;
    }

    @Override
    public void stop() {
        running=false;
    }

    public String getName(){
        return name;
    }
}
