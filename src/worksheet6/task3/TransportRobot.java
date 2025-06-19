package worksheet6.task3;

public class TransportRobot extends BaseRobot implements Runnable{
    public TransportRobot(String name){
        super(name);
    }

    public void run(){
        performTask();
    }

    public void performTask(){
        if(!isRunning()) return;
        for(int i=0;i<5;i++){
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){

            }
            System.out.println("Task "+i);
        }
    }
}
