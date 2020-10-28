package factories;

import enums.ShapesEnum;
import shapes.RoundedRectangle;
import shapes.RoundedSquare;
import shapes.Shape;

public class RoundedShapeShapeFactory extends AbstractShapeFactory {
    @Override
    public Shape getShape(ShapesEnum shapeType) {
        switch (shapeType) {
            case RECTANGLE:
                return new RoundedRectangle();
            case SQUARE:
                return new RoundedSquare();
            default: return null;
        }
    }
}
