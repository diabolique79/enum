public enum Menu {

    CIRCLE(new Circle()),
    RECTANGLE(new Rectangle()),
    SQUARE(new Square()),
    TRIANGLE(new Triangle());

    public final Shape shape;

    Menu(Shape shape) {
        this.shape = shape;
    }

    public Shape getShape() {
        return shape;
    }
}
