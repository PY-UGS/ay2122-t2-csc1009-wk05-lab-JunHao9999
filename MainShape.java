
public class MainShape {
    public static void main(String[] args) {
        RectangleShape r=new RectangleShape(9,5);
        TriangleShape t=new TriangleShape(10,8);
        CircleShape c=new CircleShape(5,5);
        EllipseShape e=new EllipseShape(7,7);
        SquareShape s=new SquareShape(6,6);
        //reference var for abstract class
        Shape ref;
        ref=r;
        System.out.println("Area is " +ref.area());
        ref=t;
        System.out.println("Area is " +ref.area());
        ref=c;
        System.out.println("Area is " +ref.area());
        ref=e;
        System.out.println("Area is " +ref.area());
        ref=s;
        System.out.println("Area is " +ref.area());


    }
}
