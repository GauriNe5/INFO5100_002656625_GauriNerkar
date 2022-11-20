
import java.io.*;

abstract class Shapes  {
    void area(){
        System.out.println("Method of Shapes class");
    }
}

class Triangle extends Shapes implements java.io.Serializable{
    int base=2;
    int triangleHeight=6;
    static String color = "Red";
    String triangleColor;
    public Triangle(int triangleHeight, String color) {

        this.triangleHeight = triangleHeight;
        this.color = color;
    }

    //for serialization



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
    public static void main(String[] args) {


        Triangle object01 = new Triangle(10, "Pink");
        String filename = "triangle1.ser";

        // Serialization
        try {
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object
            out.writeObject(object01);

            out.close();
            file.close();

            System.out.println("Object has been serialized.");

        } catch (IOException ex) {
            System.out.println("IOException is caught.");
        }

        Triangle object02 = null;

        // Deserialization
        try {

            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            object02 = (Triangle) in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized ");

            System.out.println("Height = " + object02.triangleHeight);

            System.out.println("Triangle Color = " + object02.color);
        }

             catch (IOException ex) {

            System.out.println("IOException is caught");

        }

            catch (ClassNotFoundException ex) {

            System.out.println("ClassNotFoundException is caught");
         }


        Shapes objectOne = new Triangle(5, "purple");
        objectOne.area();

        Triangle obj1 = new Triangle(20, "grey");

        Rectangle obj2 = new Rectangle();
        obj2.Perimeter();

        Shapes obj3 = new Circle();
        obj3.area();


        System.out.println("Circle color: " + Circle.circleColor);

    }


}