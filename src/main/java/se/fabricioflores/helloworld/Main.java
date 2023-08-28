package se.fabricioflores.helloworld;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Point p = new Point(6.0, 4.0);
        Point p2 = new Point(2.0, 2.0);

        System.out.println(p2.distanceTo(p));
    }
}