package worksheet7.task1;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    @Override
    public double getArea(){
        return width*length;
    }

    @Override
    public String toString() {
        return "Rectangle: Width = "+width+", Length = "+length;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        if(width>=0)this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        if(length>=0)this.length = length;
    }
}
