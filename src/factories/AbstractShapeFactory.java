package factories;

import enums.ShapesEnum;
import shapes.Shape;

public abstract class AbstractShapeFactory {
    public abstract Shape getShape(ShapesEnum shapeType) ;
}
