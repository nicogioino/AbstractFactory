package factories;

public class FactoryProducer {

    public static AbstractShapeFactory generateFactory(boolean rounded){
        return rounded ? new RoundedShapeShapeFactory() : new ShapeFactory();
    }
}
