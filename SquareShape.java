public class SquareShape extends Shape{
    public SquareShape(double dim1,double dim2){
        super(dim1,dim2);
    }
    public double area(){
        System.out.println("Inside area of Square.");
        return getDim1()*getDim2();
    }
}
