package org.example.volumetric.shapes;

public class Cube implements ThreeDimensionalShape {
    private final double edge;

    public Cube(double edge) {
        if (edge <= 0) throw new IllegalArgumentException("Ребро куба должно быть > 0");
        this.edge = edge;
    }

    @Override
    public double getVolume() {
        return Math.pow(edge, 3);
    }

    @Override
    public double getSurfaceArea() {
        return 6 * Math.pow(edge, 2);
    }

    public double getEdge() {
        return edge;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "edge=" + edge +
                '}';
    }
}
