package se.fabricioflores.helloworld;

import org.jetbrains.annotations.NotNull;

public class Point {
    private double x;
    private double y;

    public Point() {
        this(0.0, 0.0);
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(@NotNull Point point) {
        this.x = point.x;
        this.y = point.y;
    }

    public double getX() {
        return  x;
    };

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distanceTo(@NotNull Point other) {
        // Räknar ut avståndet med Pythagoras sats
        return Math.sqrt(Math.pow(x - other.x, 2) + Math.pow(y - other.y, 2));
    }

    public static Point copyOf(Point p) {
        return new Point(p);
    }

    public Point copyOf() {
        return new Point(x, y);
    }
}