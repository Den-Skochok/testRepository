package MyPackage.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        System.out.println("Hello, world");
        hello("world");
        hello("11111");

        //area from MyFirstProgram
        double l = 5;
        System.out.println(area(l));
        //area from MyFirstProgram

        //area from Square
        Square s = new Square(5);
         System.out.println("11111 " + s.area());
        //area from Square
    }

    public static void hello(String somebody){
        System.out.println("Hello " + somebody );
    }

    public static double area(double l){
        return l * l;
    }
}
