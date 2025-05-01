package worksheet3.task3;

public interface Dimmable {
    int MAX_BRIGHTNESS = 100;
    void setBrightness(int level);
    int getBrightness();
    default void dimToHalf(){
        //Default method void dimToHalf() that sets brightness to MAX_BRIGHTNESS / 2
    }
}
