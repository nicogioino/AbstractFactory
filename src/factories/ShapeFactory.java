package factories;

import enums.ShapesEnum;
import factories.AbstractFactory;
import shapes.Rectangle;
import shapes.Shape;
import shapes.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(ShapesEnum shapeType) {
        switch (shapeType) {
            case RECTANGLE:
                return new Rectangle();
            case SQUARE:
                return new Square();
            default: return null;
        }
    }
}
