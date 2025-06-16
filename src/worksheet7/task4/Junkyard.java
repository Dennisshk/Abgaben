package worksheet7.task4;

import java.util.ArrayList;
import java.util.Collection;

public class Junkyard {
    ArrayList<? super Vehicle> destroyed = new ArrayList<>();
    // Alles unter Vehicle einfügbar (Vehicle oder höher ist höher als das Eingefügte)

    public void destroyVehicle(Collection<? extends Vehicle> vehicles){
        for(Vehicle v : vehicles){
            if(!v.hasTuv){
                //in vehicles ist add() nicht möglich
                //in destroyed kein get()
                destroyed.add(v);
                vehicles.remove(v);
            }
        }
    }

    public ArrayList<? super Vehicle> getDestroyed(){
        return destroyed;
    }
}
