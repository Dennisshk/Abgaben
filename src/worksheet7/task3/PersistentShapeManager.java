package worksheet7.task3;

import worksheet7.task1.Shape;

import java.io.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class PersistentShapeManager {
    public static void saveShapesToFile(Collection<? extends Shape> shapes, String filename){
        File file=new File(filename);
//        try {
//            if (!file.exists()) file.createNewFile();
//        }catch(IOException e){
//            System.out.println(e.getMessage());
//            return;
//        }
        try(FileWriter fw = new FileWriter(file,true); BufferedWriter bw = new BufferedWriter(fw)){
            //if(file.length()!=0) bw.newLine();
            for(Shape s: shapes){
                bw.write(s.toString());
                bw.newLine();
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }


    public static List<Shape> loadShapesFromFile(String filename){
        List<Shape> result = new LinkedList<>();

        File file = new File(filename);
        try(FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr)){
            String shapeAsString;
            while(  (shapeAsString=br.readLine()) != null){
                try{
                    Shape s = ShapeFactory.fromString(shapeAsString);
                    result.add(s);
                }catch(IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        return result;
    }

    public static void clearFile(String filename){
        File f = new File(filename);
        try(FileWriter fw = new FileWriter(f,false)){
            //fw.write("");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }


}
