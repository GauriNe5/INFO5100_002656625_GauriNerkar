// Abstract class
public abstract class ShapeDecoratorPattern implements Shape {

    protected Shape decoratedShapePattern;


    public ShapeDecoratorPattern(Shape decoratedShapePattern)
    {
        this.decoratedShapePattern = decoratedShapePattern;
    }


    // Outside abstract class
    public void draw() { decoratedShapePattern.draw(); }
}