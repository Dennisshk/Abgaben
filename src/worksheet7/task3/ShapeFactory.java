package worksheet7.task3;

import worksheet7.task1.Circle;
import worksheet7.task1.Rectangle;
import worksheet7.task1.Shape;

import java.util.ArrayList;

public class ShapeFactory {
    public static Shape fromString(String input) throws IllegalArgumentException{
        //formatiere String
        if(input==null) throw new IllegalArgumentException("input can't be null");
        //\\s+ = alle Leerzeichen
        input = input.replaceAll("\\s+","");
        input=input.toLowerCase();

        //Trenne Klassen Name und Argumente mit :
        int i = input.indexOf(":");
        if(i==-1 || i==0) throw new IllegalArgumentException(": expected between class-name and arguments");
        String className = input.substring(0,i);
        String arguments = input.substring(i);

        //Trenne einzelne Argumente -> doubles zwischen = und ,
        arguments = arguments.replace(":","");
        arguments=arguments+",";

        ArrayList<Double> doubles= new ArrayList<>();
        //Suche alle Formate mit =double,
        while(arguments.contains("=")){
            int start=arguments.indexOf("=");
            int end=arguments.indexOf(",");
            if(end==-1) throw new IllegalArgumentException(", expected after argument");

            //speichere double Wert
            String doubleArgument = arguments.substring(start+1,end);
            try {
                doubles.add(Double.parseDouble(doubleArgument));
            }catch(NumberFormatException e){
                throw new IllegalArgumentException("double between = and , expected");
            }

            //aktualisiere input-String
            if(end+1==arguments.length())break;
            arguments=arguments.substring(end+1);
        }

        //Erstelle neues Shape
        Shape result=null;
        if(className.equals("circle")){
            if(doubles.size()!=1) throw new IllegalArgumentException("expected 1 argument, found "+doubles.size());
            result=new Circle(doubles.getFirst());
        }else if(className.equals("rectangle")){
            if(doubles.size()!=2) throw new IllegalArgumentException("expected 2 argument, found "+doubles.size());
            result= new Rectangle(doubles.get(0), doubles.get(1));
        }
        if(result==null) throw new IllegalArgumentException("not existing Shape Name");
        return result;
    }
}
