import java.util.*;

public class GeometricObject {
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;

    //constructors
    public GeometricObject(){
        this.color="white";
        this.filled=false;
    }

    public GeometricObject(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }

    //getters & setters
    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color=color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled=filled;
    }

    public java.util.Date getDateCreated(){
        Date date=new Date();
        return date;
    }

    //return string representation of this object?? ask..
    public String toString(){
        return "created on "+getDateCreated();
    }


}
