package worksheet7.task1;

import java.util.ArrayList;

public class ShapeStorage<T extends Shape> extends ArrayList<T> {

    public double getTotalArea(){
        double result = 0;
        for(T s:this){
            if(s!=null) result=result+s.getArea();
        }
        return result;
    }

    public void displayAllShapes(){
        for(int i=1;i<=this.size();i++){
            T shape = this.get(i-1);
            System.out.println(i+". "+shape);
        }
    }

    public <U extends T> void importLargeShapes(ShapeStorage<U> other, double minArea){
        for(U shape:other){
            if(shape!=null && shape.getArea()>=minArea){
                this.add(shape);
            }
        }
    }
}
