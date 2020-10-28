package factories;

import shapes.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(String shapeType) ;
}
