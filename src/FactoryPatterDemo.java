import enums.ShapesEnum;
import factories.AbstractShapeFactory;
import factories.FactoryProducer;
import shapes.Shape;

public class FactoryPatterDemo {
    public static void main(String[] args) {
        //get shape factory
        AbstractShapeFactory shapeFactory = FactoryProducer.generateFactory(false);

        //generate a normal Rectangle
        Shape shape1 = shapeFactory.getShape(ShapesEnum.RECTANGLE);
        shape1.draw();

        //generate a normal Square
        Shape shape2 = shapeFactory.getShape(ShapesEnum.SQUARE);
        shape2.draw();

        //change shape factory to rounded Factory
        shapeFactory= FactoryProducer.generateFactory(true);

        //generate a roundedRectangle
        Shape shape3 = shapeFactory.getShape(ShapesEnum.RECTANGLE);
        shape3.draw();

        //generate a rounded Square
        Shape shape4 = shapeFactory.getShape(ShapesEnum.SQUARE);
        shape4.draw();
    }
}
