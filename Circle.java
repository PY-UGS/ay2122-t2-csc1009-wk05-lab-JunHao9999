//Circle is a subclass(child) that inherits the attributes and methods from GeometricObject class (superclass,parent)
import java.util.*;
public class Circle extends GeometricObject{
    final double pi=3.14159265359;
    private double radius;

    public Circle(){
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius,String color,boolean filled){
        this.radius=radius;
        //color and filled is private
        super.setColor(color);
        super.setFilled(filled);
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return pi*Math.pow(this.radius,2);
    }
    public double getPerimeter(){
        return 2*pi*this.radius;
    }
    public double getDiameter(){
        return 2*this.radius;
    }

    public void printCircle(){
        boolean temp;
        System.out.println("A circle "+ super.toString());
        if(super.getColor()=="white" && super.isFilled()!=true){
            temp=false;
        }
        else
            temp=false;
        System.out.println("color: white and filled: "+temp);
        System.out.println("The color is "+ getColor());
        System.out.println("The radius is "+ getRadius());
        System.out.println("The area is "+ getArea());
        System.out.println("The diameter is "+ getDiameter());

    }
}
