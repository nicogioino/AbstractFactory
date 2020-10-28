package factories;

import factories.AbstractFactory;
import factories.RoundedShapeFactory;
import factories.ShapeFactory;

public class FactoryProducer {

    public static AbstractFactory generateFactory(boolean rounded){
        return rounded ? new RoundedShapeFactory() : new ShapeFactory();
    }
}
