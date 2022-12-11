
// Main class
public class DecoratorPatternMain {

    // Main driver method
    public static void main(String[] args)
    {
       
        Shape circle = new Circle();

        Shape blueCircle = new BlueShapeDecoratorPattern(new Circle());

        Shape blueRectangle = new BlueShapeDecoratorPattern(new Rectangle());

       
        System.out.println("Circle with basic border");


        circle.draw();

        
        System.out.println("\nCircle of blue border");

     
        blueCircle.draw();

        
        System.out.println("\nRectangle of blue border");

       
        blueRectangle.draw();
    }
}
