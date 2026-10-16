package org.example;

import org.example.geometry.*;

public class GeometryUtils {

    public boolean geometryComparator(Shape s1, Shape s2) {
        if (s1 == null || s2 == null) {
            return false;
        }
        if (s1.getClass() != s2.getClass()) {
            return false;
        }

        if (s1 instanceof Circle c1 && s2 instanceof Circle c2) {
            return comparatorToCircle(c1, c2);
        }

        if (s1 instanceof Rectangle r1 && s2 instanceof Rectangle r2) {
            return comparatorToRectangle(r1, r2);
        }

        if (s1 instanceof Triangle t1 && s2 instanceof Triangle t2){
            return comparatorToTriangle(t1, t2);}

        return false;
    }


    private boolean comparatorToCircle(Circle c1, Circle c2) {
        return c1.getRadius() == c2.getRadius();
    }

    private boolean comparatorToRectangle(Rectangle r1, Rectangle r2) {
        return r1.getHeight() == r2.getHeight() && r1.getWidth() == r2.getWidth();
    }

    private boolean comparatorToTriangle(Triangle t1, Triangle t2) {
        return t1.getA() == t2.getA() && t1.getB() == t2.getB() && t1.getC() == t2.getC();
    }

}