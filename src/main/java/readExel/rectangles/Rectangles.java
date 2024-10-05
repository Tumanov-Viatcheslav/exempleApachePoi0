package readExel.rectangles;

import java.util.*;

public class Rectangles {

    public static double calculateAverageArea(Collection<Rectangle> rectangles) throws Exception {
        if (rectangles == null)
            throw  new Exception("Expected collection but null encountered");
        if (rectangles.isEmpty())
            throw new Exception("Trying to calculate average area of empty collection");
        double sum = 0;
        for (Rectangle rectangle : rectangles) {
            sum += rectangle.area();
        }
        return sum / rectangles.size();
    }

    public static double calculateAverageArea(Rectangle[] rectangles) throws Exception {
        if (rectangles == null)
            throw  new Exception("Expected array but null encountered");
        if (rectangles.length == 0)
            throw new Exception("Trying to calculate average area of empty array");
        double sum = 0;
        for (Rectangle rectangle : rectangles) {
            sum += rectangle.area();
        }
        return sum / rectangles.length;
    }

    public static double calculateMaximumArea(Collection<Rectangle> rectangles) throws Exception {
        if (rectangles == null)
            throw  new Exception("Expected collection but null encountered");
        if (rectangles.isEmpty())
            throw new Exception("Trying to calculate maximum area of empty collection");
        double max = Double.MIN_VALUE;
        for (Rectangle rectangle : rectangles) {
            max = max < rectangle.area() ? rectangle.area() : max;
        }
        return max;
    }

    public static double calculateMaximumArea(Rectangle[] rectangles) throws Exception {
        if (rectangles == null)
            throw  new Exception("Expected array but null encountered");
        if (rectangles.length == 0)
            throw new Exception("Trying to calculate maximum area of empty array");
        double max = Double.MIN_VALUE;
        for (Rectangle rectangle : rectangles) {
            max = max < rectangle.area() ? rectangle.area() : max;
        }
        return max;
    }

    public static void sortByArea(List<Rectangle> rectangles) throws Exception {
        if (rectangles == null)
            throw  new Exception("Expected collection but null encountered");
        if (rectangles.isEmpty())
            return;
        rectangles.sort(Comparator.comparingDouble(Rectangle::area));
    }

    public static void sortByArea(Rectangle[] rectangles) throws Exception {
        if (rectangles == null)
            throw  new Exception("Expected array but null encountered");
        if (rectangles.length == 0)
            return;
        Arrays.sort(rectangles, Comparator.comparingDouble(Rectangle::area));
    }
}
