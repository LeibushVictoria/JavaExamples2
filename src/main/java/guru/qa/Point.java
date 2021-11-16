package guru.qa;

import java.util.*;

public class Point implements Comparable<Point>{
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }

    public static void main (String[]args){

        List<Point> points = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            points.add(new Point((int) (Math.random() *100), (int) (Math.random() *100)));
        }

        Collections.sort(points, Comparator.comparing(Point::getX));
        System.out.println("Points sorted by x:");
        points.forEach(System.out::println);

        Collections.sort(points, Comparator.comparing(Point::getX));
        Collections.reverse(points);
        System.out.println("Points sorted by x reverse:");
        points.forEach(System.out::println);

        Collections.sort(points, Comparator.comparing(Point::getY));
        System.out.println("Points sorted by y:");
        points.forEach(System.out::println);

        Collections.sort(points, Comparator.comparing(Point::getY));
        Collections.reverse(points);
        System.out.println("Points sorted by y reverse:");
        points.forEach(System.out::println);
    }

    @Override
    public int compareTo(Point otherP) {
        return this.x - otherP.x;
    }
}