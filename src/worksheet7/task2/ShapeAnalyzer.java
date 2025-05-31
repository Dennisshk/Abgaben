package worksheet7.task2;

import worksheet7.task1.Shape;

import java.util.*;

public class ShapeAnalyzer {

    public static List<Shape> filterByMinArea(Collection<? extends Shape> shapes, double minArea){
        List<Shape> result= new LinkedList<>();
        for(Shape s:shapes){
            if(s!=null && s.getArea()>=minArea) result.add(s);
        }
        //shapes.add(null);
        return result;
    }

    public static Shape findShapeWithMaxArea(Collection<? extends Shape> shapes){
        Shape max = null;
        for(Shape s:shapes){
            if( s!=null &&   (max==null || max.getArea()<s.getArea())  ) max=s;
        }
        return max;
    }

    public static <T extends Shape> Map<String, List<T>> groupByType(Collection<T> shapes){
        Map<String,List<T>> result = new HashMap<>();
        for(T shape: shapes){
            String className = shape.getClass().getSimpleName();
            if(result.containsKey(className)){
                List<T> oldList= result.get(className);
                oldList.add(shape);
            }else{
                List<T> newList = new ArrayList<>();
                newList.add(shape);
                result.put(className,newList);
            }
        }
        return result;
    }
}
