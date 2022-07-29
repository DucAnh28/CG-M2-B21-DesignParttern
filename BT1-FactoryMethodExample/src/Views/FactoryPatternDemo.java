package Views;

import Controller.ShapeFactory;
import Model.Shape;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("square");
        System.out.print("Doi tuong 1 la: ");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("hcn");
        System.out.print("Doi tuong 2 la: ");
        shape2.draw();
        Shape shape3 = shapeFactory.getShape("circle");
        System.out.print("Doi tuong 3 la: ");
        shape3.draw();
    }
}
