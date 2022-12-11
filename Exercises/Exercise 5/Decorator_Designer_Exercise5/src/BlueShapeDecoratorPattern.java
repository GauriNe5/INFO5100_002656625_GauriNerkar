
// Concrete class extending the abstract class
public class BlueShapeDecoratorPattern extends ShapeDecoratorPattern {

    public BlueShapeDecoratorPattern(Shape decoratedShapePattern)
    {
        super(decoratedShapePattern);
    }

    @Override public void draw()
    {
        decoratedShapePattern.draw();
        setBlueBorder(decoratedShapePattern);
    }

    private void setBlueBorder(Shape decoratedShapePattern)
    {
        // Display message when function is called
        System.out.println("Border Color: Blue");
    }
}