package readExel;

import org.apache.log4j.BasicConfigurator;
import readExel.rectangles.RectangleExelReader;

public class Main {

    public static void main(String[] args) {
        BasicConfigurator.configure();
        RectangleExelReader.showRectanglesFromExelFile("input2.xlsx");
        System.out.println(RectangleExelReader.readRectanglesFromExelFile("input2.xlsx"));
    }
}