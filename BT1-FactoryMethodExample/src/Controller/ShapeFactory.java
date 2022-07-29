package Controller;

import Model.Circle;
import Model.Rectangle;
import Model.Shape;
import Model.Square;

public class ShapeFactory {
    public Shape getShape(String type){
        if ("Circle".equalsIgnoreCase(type)) return new Circle();
        else if ("HCN".equalsIgnoreCase(type)) return new Rectangle();
        else if ("Square".equalsIgnoreCase(type)) return new Square();
        return null;
    }
}
