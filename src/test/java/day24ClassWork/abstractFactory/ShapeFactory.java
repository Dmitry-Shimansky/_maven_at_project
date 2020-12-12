package day24ClassWork.abstractFactory;

public class ShapeFactory {

    public Shape getShape(Type type) {

        switch (type) {
            case CIRCLE: return new Circle();
            case SQUARE: return new Square();
            default: return null;
        }
    }

    enum Type {
        CIRCLE, SQUARE
    }
}
