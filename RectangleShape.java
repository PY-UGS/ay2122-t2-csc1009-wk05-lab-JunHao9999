public class RectangleShape extends Shape{

    public RectangleShape(double dim1,double dim2){
        //since have a constructor in abstract do not need to this.dim again.
        //can just use super()
        super(dim1,dim2);
    }


    public double area(){
        System.out.println("Inside area of Rectangle.");
        return getDim1()*getDim2();
    }
}
