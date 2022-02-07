public class EllipseShape extends Shape{
    public EllipseShape(double dim1,double dim2){
        super(dim1,dim2);
    }
    public double area(){
        System.out.println("Inside area of Ellipse.");
        return pi*getDim1()*getDim2();
    }
}
