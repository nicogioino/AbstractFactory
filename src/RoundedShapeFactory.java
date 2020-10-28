public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        switch (shapeType.toLowerCase()) {
            case "rectangle":
                return new RoundedRectangle();
            case "square":
                return new RoundedSquare();
            default: return null;
        }
    }
}
