package factories;

import factories.AbstractFactory;
import shapes.Rectangle;
import shapes.Shape;
import shapes.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        switch (shapeType.toLowerCase()) {
            case "rectangle":
                return new Rectangle();
            case "square":
                return new Square();
            default: return null;
        }
    }
}
