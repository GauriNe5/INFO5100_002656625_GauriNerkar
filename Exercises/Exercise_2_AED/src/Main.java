
abstract class Shapes {
     void area(){
         System.out.println("Method of Shapes class");
    }
}

class Triangle extends Shapes{
    int base=2;
     int triangleHeight=6;
    static String color = "Red";
    public Triangle() {

        System.out.println("Constructor of Triangle class");
    }

    @Override
    public void area(){

        System.out.println("Triangle's area "+ "=" + 0.5 * base * triangleHeight);
    }
    public void triColor(){

        System.out.println("Triangle's color "+ "=" + color);
    }
}

class Rectangle extends Shapes{
    int rectBase=5;
    int rectHeight=3;
    static String rectColor = "Blue";

    public void Perimeter(){
        System.out.println("Rectangle's perimeter "+ "=" + 2*(rectBase + rectHeight));
    }
}

 class Circle extends Shapes{

     int radius=2;
     static String circleColor = "Green";

     @Override
     public void area(){

         System.out.println("Circle's area is"+ "=" + 3.14* radius * radius);
     }
 }

public class Main {
    public static void main(String[] args){

        Shapes object1 = new Triangle();
        object1.area();

        Triangle obj1 = new Triangle();

        obj1.triColor();

        Rectangle obj2 = new Rectangle();
        obj2.Perimeter();

        Shapes obj3 = new Circle();
        obj3.area();

        //accessing static fields
        System.out.println("Triangle color: "+ Triangle.color);
        System.out.println( "Rectangle color: "+ Rectangle.rectColor);
        System.out.println("Circle color: "+ Circle.circleColor);

    }
}

