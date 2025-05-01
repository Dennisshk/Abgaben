package worksheet3.task3;
public class LampDemo {
        
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        // turn on , set brightness , dim to half , print result
        lamp.turnOn();
        lamp.setBrightness(80);
        lamp.dimToHalf();
        System.out.println(" Brightness : " + lamp.getBrightness());
    }
}