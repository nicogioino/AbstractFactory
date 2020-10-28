import factories.AbstractFactory;
import factories.FactoryProducer;
import shapes.Shape;

public class FactoryPatterDemo {
    public static void main(String[] args) {
        //get shape factory
        AbstractFactory shapeFactory = FactoryProducer.generateFactory(false);

        //get an object of shapes.Shape shapes.Rectangle
        Shape shape1 = shapeFactory.getShape("RECTANGLE");

        //call draw method of shapes.Shape shapes.Rectangle
        shape1.draw();

        //get an object of shapes.Shape shapes.Square
        Shape shape2 = shapeFactory.getShape("SQUARE");

        //call draw method of shapes.Shape shapes.Square
        shape2.draw();

        //change shape factory to rounded Factory
        shapeFactory= FactoryProducer.generateFactory(true);

        //get an object of shapes.Shape shapes.Rectangle
        Shape shape3 = shapeFactory.getShape("RECTANGLE");

        //call draw method of shapes.Shape shapes.Rectangle
        shape3.draw();

        //get an object of shapes.Shape shapes.Square
        Shape shape4 = shapeFactory.getShape("SQUARE");

        //call draw method of shapes.Shape shapes.Square
        shape4.draw();
    }
}
