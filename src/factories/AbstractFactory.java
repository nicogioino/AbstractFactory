package factories;

import enums.ShapesEnum;
import shapes.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(ShapesEnum shapeType) ;
}
