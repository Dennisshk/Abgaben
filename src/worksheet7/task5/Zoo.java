package worksheet7.task5;

import java.util.HashMap;

public class Zoo {
    private final HashMap<Mammal,Integer> zooInhabitants= new HashMap<>();

    public void addAnimal(Mammal m){
        if(!zooInhabitants.containsKey(m)){
            zooInhabitants.put(m,0);
        }
        Integer i=zooInhabitants.get(m);
        zooInhabitants.remove(m);
        zooInhabitants.put(m,i+1);
    }
}
