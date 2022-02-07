public class CircleShape extends Shape{
    public CircleShape(double dim1,double dim2){
        super(dim1,dim2);
    }
    public double area(){
        System.out.println("Inside area of Circle.");
        return pi*(getDim1()*getDim2());
    }
}
