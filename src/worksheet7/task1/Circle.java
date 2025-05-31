package worksheet7.task1;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        setRadius(radius);
    }

    @Override
    public String toString() {
        return "Circle: Radius = "+radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        if(radius>=0) this.radius=radius;
    }
}
