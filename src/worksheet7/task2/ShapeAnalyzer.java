package worksheet7.task2;

import worksheet7.task1.Shape;

import java.util.*;

public class ShapeAnalyzer {

    /*
    1) Why is it important to use the wildcard <? extends Shape> in the method signature instead of a non-generic parameter? Hint: Think invariance.
    Da sonst die Klasse invariant zu dem nicht-generischen Parameter sein muss. Wenn es Shape wäre, dann könnte die Methode nur mit genau <Shape>
    aufgerufen werden, da keine Kovarianz (extends) erlaubt wäre und Kontravarianz (super) ebenfalls nicht. <Circle> wäre somit nicht möglich,
    <Object> wäre o oder so nicht möglich.

    2) Explain the design choice of using <T extends Shape> in groupByType instead of a wildcard.
    Es gibt hier 2 Mal einen Parameter, welcher gleich sein sollte. Eine Wildcard würde nur die Bedingung fordern, dass beide Male der eingegebene
    Parameter von Shape erbt. Aber nicht, dass es genau die gleiche Klasse ist. Eine solche generische Methode verlangt genau das. Wäre es trotzdem
    mit Wildcards gemacht worden, dann könnte man höchstens eine shape-List zurückgeben, da die Beziehung zwischen den beiden Collections ohne
    Weiteres nicht klar wäre.

    3) Explain the design choice to make the methods in ShapeAnalyzer static.
    Für static-Methoden ist ein Aufruf der Methoden durch den Klassennamen möglich. Es muss kein Objekt von dieser Klasse vorher angelegt werden.
    Dadurch, dass diese Methode keine Attribute hat und somit ein erstelltes Objekt ununterscheidbar wäre zu einem weiteren Objekt dieser Klasse,
    ist das Erstellen eines solchen Objekts nicht sinnvoll. Deswegen sollen die Methoden direkt über die Klasse aufgerufen werden. Da es auch keine
    Attribute gibt, gibt es kein Problem, dass static Methoden nur auf static-Attribute zugreifen können.
     */

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
