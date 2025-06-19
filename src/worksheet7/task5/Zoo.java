package worksheet7.task5;

import java.util.HashMap;

public class Zoo <A extends Animal>{
    private final HashMap<A,Integer> zooInhabitants= new HashMap<>();

    public void addAnimal(A m){
        if(!zooInhabitants.containsKey(m)){
            zooInhabitants.put(m,0);
        }
        Integer i=zooInhabitants.get(m);
        zooInhabitants.remove(m);
        zooInhabitants.put(m,i+1);
    }
}
