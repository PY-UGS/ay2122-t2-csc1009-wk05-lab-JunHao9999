public class TriangleShape extends Shape {
    public TriangleShape(double dim1,double dim2){
        super(dim1,dim2);
    }
    public double area(){
        System.out.println("Inside area of Triangle.");
        return (getDim1()*getDim2())/2;
    }
}
