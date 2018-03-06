package DesignPatterns.Facade.ShapeExample;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle : Draw()");
    }
}
