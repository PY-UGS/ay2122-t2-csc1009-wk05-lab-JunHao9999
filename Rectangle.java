public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle(){
    }
    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }
    public Rectangle(double width,double height,String color,boolean filled){
        this.width=width;
        this.height=height;
        super.setColor(color);
        super.setFilled(filled);
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getArea(){
        return this.width*this.height;
    }
    public double getPerimeter(){
        return 2*(this.height*this.width);
    }
    public void printRectangle(){
        boolean temp;
        System.out.println("A rectangle "+ super.toString());
        if(super.getColor()=="white" && super.isFilled()!=true){
            temp=false;
        }
        else
            temp=false;
        System.out.println("color: white and filled: "+temp);
        System.out.println("The area is "+ getArea());
        System.out.println("The perimeter is "+ getPerimeter());

    }

}
