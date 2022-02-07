public abstract class Shape {
    private double dim1;
    private double dim2;
    final double pi=3.14;
    public Shape(double dim1,double dim2){
        this.dim1=dim1;
        this.dim2=dim2;
    }
    //private dims so need getters to return them
    public double getDim1() {
        return dim1;
    }
    public double getDim2() {
        return dim2;
    }


    public abstract double area();

}
