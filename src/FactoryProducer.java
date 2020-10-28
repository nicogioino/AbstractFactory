public class FactoryProducer {

    public static AbstractFactory generateFactory(boolean rounded){
        return rounded ? new RoundedShapeFactory() : new ShapeFactory();
    }
}
