package org.example;
import org.example.geometry.*;
import org.example.volumetric.shapes.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== GeometryApp ===\n");

        Circle circle = new Circle(5.0);
        double areaCircle = circle.getArea();
        double perimeterCircle = circle.getPerimeter();
        System.out.println("circle area " + areaCircle + ", circle perimeter " + perimeterCircle);

        Rectangle rectangle = new Rectangle(4.0, 4.0);
        double areaRectangle = rectangle.getArea();
        double perimeterRectangle = rectangle.getPerimeter();
        double diagonalRectangle = rectangle.getDiagonal();
        System.out.println("rectangle area " + areaRectangle + ", rectangle perimeter " + perimeterRectangle +
                ", diagonal rectangle " + diagonalRectangle);

        Triangle triangle = new Triangle(3.0, 4.0, 3.0);
        double areaTriangle = triangle.getArea();
        double perimeterTriangle = triangle.getPerimeter();
        System.out.println("triangle area " + areaTriangle + ", triangle perimeter " + perimeterTriangle+ "\n");

        System.out.println("=== Тестирование Geometry Utils ===\n");

        GeometryUtils utils = new GeometryUtils();
        Shape circle1 = new Circle(5.0);
        Shape circle2 = new Circle(5.0);
        boolean result = utils.geometryComparator(circle1, circle2);
        System.out.println("Сравнение circle1 и circle2 " + result);

        Shape circle3 = new Circle(4.0);
        Shape circle4 = new Circle(6.0);
        boolean result1 = utils.geometryComparator(circle3, circle4);
        System.out.println("Сравнение circle3 и circle4 " +result1 + "\n");

        System.out.println("=== Тестирование объемных фигур ===\n");

        ThreeDimensionalShape sphere = new Sphere(3.0);
        double volumeSphere = sphere.getVolume();
        double surfaceAreaSphere = sphere.getSurfaceArea();
        System.out.println("sphere volume " + volumeSphere + ", sphere area sphere " + surfaceAreaSphere);


        ThreeDimensionalShape cube = new Cube(4.0);
        double volumeCube = cube.getVolume();
        double surfaceAreaCube = cube.getSurfaceArea();
        System.out.println("cube volume " + volumeCube + ", cube area sphere " + surfaceAreaCube+ "\n");

    }
}