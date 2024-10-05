package readExel.rectangles;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class RectangleExelReader {
    public static void showRectanglesFromExelFile(String fileName) {
        try (Workbook exelFile = new XSSFWorkbook(new FileInputStream(fileName))) {
            Sheet sheet = exelFile.getSheetAt(0);
            for (int i = 0; i <= sheet.getLastRowNum(); i++) {
                try {
                    Row row = sheet.getRow(i);
                    if (row.getLastCellNum() != 2)
                        throw new Exception("Need exactly 2 parameters for rectangle");
                    System.out.println(row.getCell(0).getNumericCellValue() + " " + row.getCell(1).getNumericCellValue());
                }
                catch (Exception e) {
                    System.out.println(e.getClass().getName() + ": " + e.getMessage());
                }
            }
        }
        catch (Exception e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }

    public static List<Rectangle> readRectanglesFromExelFile(String fileName) {
        List<Rectangle> rectangleList = new ArrayList<>();
        try (Workbook exelFile = new XSSFWorkbook(new FileInputStream(fileName))) {
            Sheet sheet = exelFile.getSheetAt(0);
            for (int i = 0; i <= sheet.getLastRowNum(); i++) {
                try {
                    Row row = sheet.getRow(i);
                    if (row.getLastCellNum() != 2)
                        throw new Exception("Need exactly 2 parameters for rectangle");
                    rectangleList.add(new Rectangle(row.getCell(0).getNumericCellValue(), row.getCell(1).getNumericCellValue()));
                }
                catch (Exception e) {
                    System.out.println(e.getClass().getName() + ": " + e.getMessage());
                }
            }
        }
        catch (Exception e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
        }
        return rectangleList;
    }
}
