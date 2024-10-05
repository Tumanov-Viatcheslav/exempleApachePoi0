import org.junit.jupiter.api.*;
import readExel.rectangles.Rectangle;
import readExel.rectangles.Rectangles;

import java.util.ArrayList;
import java.util.List;

public class TestRectangles {
    @BeforeEach
    void testStarted(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName() + "\n============[started]============");
    }

    @AfterEach
    void testEnded() {
        System.out.println("=============[ended]=============\n");
    }

    @Nested
    @DisplayName("Test calculateAverageArea")
    public class TestCalculateAverageArea {

        @BeforeAll
        static void testCalculateAverageAreaStarted() {
            System.out.println("[Testing calculateAverageArea started]");
        }

        @AfterAll
        static void testCalculateAverageAreaEnded() {
            System.out.println("[Testing calculateAverageArea ended]");
        }

        @Test
        @DisplayName("Test null argument: ")
        void test1() {
            Exception exceptionCollection = Assertions.assertThrows(Exception.class, () -> Rectangles.calculateAverageArea((List<Rectangle>)null));
            Assertions.assertEquals("Expected collection but null encountered", exceptionCollection.getMessage());
            Exception exceptionArray = Assertions.assertThrows(Exception.class, () -> Rectangles.calculateAverageArea((Rectangle[])null));
            Assertions.assertEquals("Expected array but null encountered", exceptionArray.getMessage());
        }

        @Test
        @DisplayName("Test empty: ")
        void test2() {
            Exception exceptionCollection = Assertions.assertThrows(Exception.class, () -> Rectangles.calculateAverageArea(new ArrayList<>()));
            Assertions.assertEquals("Trying to calculate average area of empty collection", exceptionCollection.getMessage());
            Exception exceptionArray = Assertions.assertThrows(Exception.class, () -> Rectangles.calculateAverageArea(new Rectangle[0]));
            Assertions.assertEquals("Trying to calculate average area of empty array", exceptionArray.getMessage());
        }

        @Test
        @DisplayName("Test correct: ")
        void testCorrect() {
            List<Rectangle> rectangleList = new ArrayList<>();
            Rectangle[] rectangleArray = new Rectangle[4];
            try {
                rectangleList.add(new Rectangle(10, 15));
                rectangleArray[0] = new Rectangle(10, 15);
                rectangleList.add(new Rectangle(1, 15));
                rectangleArray[1] = new Rectangle(1, 15);
                rectangleList.add(new Rectangle(2, 15));
                rectangleArray[2] = new Rectangle(2, 15);
                rectangleList.add(new Rectangle(100, 15));
                rectangleArray[3] = new Rectangle(100, 15);
            }
            catch (Exception _) {}
            double averageAreaFromList = Assertions.assertDoesNotThrow(() -> Rectangles.calculateAverageArea(rectangleList));
            Assertions.assertEquals(423.75, averageAreaFromList);
            double averageAreaFromArray = Assertions.assertDoesNotThrow(() -> Rectangles.calculateAverageArea(rectangleArray));
            Assertions.assertEquals(423.75, averageAreaFromArray);
        }
    }

    @Nested
    @DisplayName("Test calculateMaximumArea")
    public class TestCalculateMaximumArea {

        @BeforeAll
        static void testCalculateMaximumAreaStarted() {
            System.out.println("[Testing calculateMaximumArea started]");
        }

        @AfterAll
        static void testCalculateMaximumAreaEnded() {
            System.out.println("[Testing calculateMaximumArea ended]");
        }

        @Test
        @DisplayName("Test null argument: ")
        void test1() {
            Exception exceptionCollection = Assertions.assertThrows(Exception.class, () -> Rectangles.calculateMaximumArea((List<Rectangle>)null));
            Assertions.assertEquals("Expected collection but null encountered", exceptionCollection.getMessage());
            Exception exceptionArray = Assertions.assertThrows(Exception.class, () -> Rectangles.calculateMaximumArea((Rectangle[])null));
            Assertions.assertEquals("Expected array but null encountered", exceptionArray.getMessage());
        }

        @Test
        @DisplayName("Test empty: ")
        void test2() {
            Exception exceptionCollection = Assertions.assertThrows(Exception.class, () -> Rectangles.calculateMaximumArea(new ArrayList<>()));
            Assertions.assertEquals("Trying to calculate maximum area of empty collection", exceptionCollection.getMessage());
            Exception exceptionArray = Assertions.assertThrows(Exception.class, () -> Rectangles.calculateMaximumArea(new Rectangle[0]));
            Assertions.assertEquals("Trying to calculate maximum area of empty array", exceptionArray.getMessage());
        }

        @Test
        @DisplayName("Test correct: ")
        void testCorrect() {
            List<Rectangle> rectangleList = new ArrayList<>();
            Rectangle[] rectangleArray = new Rectangle[4];
            try {
                rectangleList.add(new Rectangle(10, 15));
                rectangleArray[0] = new Rectangle(10, 15);
                rectangleList.add(new Rectangle(1, 15));
                rectangleArray[1] = new Rectangle(1, 15);
                rectangleList.add(new Rectangle(2, 15));
                rectangleArray[2] = new Rectangle(2, 15);
                rectangleList.add(new Rectangle(100, 15));
                rectangleArray[3] = new Rectangle(100, 15);
            }
            catch (Exception _) {}
            double maximumAreaFromList = Assertions.assertDoesNotThrow(() -> Rectangles.calculateMaximumArea(rectangleList));
            Assertions.assertEquals(1500, maximumAreaFromList);
            double maximumAreaFromArray = Assertions.assertDoesNotThrow(() -> Rectangles.calculateMaximumArea(rectangleArray));
            Assertions.assertEquals(1500, maximumAreaFromArray);
        }
    }

    @Nested
    @DisplayName("Test sortByArea")
    public class TestSortByArea {

        @BeforeAll
        static void testSortByAreaStarted() {
            System.out.println("[Testing sortByArea started]");
        }

        @AfterAll
        static void testSortByAreaEnded() {
            System.out.println("[Testing sortByArea ended]");
        }

        @Test
        @DisplayName("Test null argument: ")
        void test1() {
            Exception exceptionCollection = Assertions.assertThrows(Exception.class, () -> Rectangles.sortByArea((List<Rectangle>)null));
            Assertions.assertEquals("Expected collection but null encountered", exceptionCollection.getMessage());
            Exception exceptionArray = Assertions.assertThrows(Exception.class, () -> Rectangles.sortByArea((Rectangle[])null));
            Assertions.assertEquals("Expected array but null encountered", exceptionArray.getMessage());
        }

        @Test
        @DisplayName("Test empty: ")
        void test2() {
            List<Rectangle> rectangleList = new ArrayList<>();
            Rectangle[] rectangleArray = new Rectangle[0];
            Assertions.assertDoesNotThrow(() -> Rectangles.sortByArea(rectangleList));
            Assertions.assertIterableEquals(new ArrayList<>(), rectangleList);
            Assertions.assertDoesNotThrow(() -> Rectangles.sortByArea(rectangleArray));
            Assertions.assertArrayEquals(new Rectangle[0], rectangleArray);
        }

        @Test
        @DisplayName("Test correct: ")
        void testCorrect() {
            List<Rectangle> rectangleList = new ArrayList<>();
            List<Rectangle> rectangleListExpected = new ArrayList<>();
            Rectangle[] rectangleArray = new Rectangle[5];
            Rectangle[] rectangleArrayExpected = new Rectangle[5];
            try {
                //To sort
                rectangleList.add(new Rectangle(10, 15));
                rectangleArray[0] = new Rectangle(10, 15);

                rectangleList.add(new Rectangle(1, 15));
                rectangleArray[1] = new Rectangle(1, 15);

                rectangleList.add(new Rectangle(2, 15));
                rectangleArray[2] = new Rectangle(2, 15);

                rectangleList.add(new Rectangle(100, 15));
                rectangleArray[3] = new Rectangle(100, 15);

                rectangleList.add(new Rectangle(10, 15));
                rectangleArray[4] = new Rectangle(10, 15);

                //Expected
                rectangleListExpected.add(new Rectangle(1, 15));
                rectangleArrayExpected[0] = new Rectangle(1, 15);

                rectangleListExpected.add(new Rectangle(2, 15));
                rectangleArrayExpected[1] = new Rectangle(2, 15);

                rectangleListExpected.add(new Rectangle(10, 15));
                rectangleArrayExpected[2] = new Rectangle(10, 15);

                rectangleListExpected.add(new Rectangle(10, 15));
                rectangleArrayExpected[3] = new Rectangle(10, 15);

                rectangleListExpected.add(new Rectangle(100, 15));
                rectangleArrayExpected[4] = new Rectangle(100, 15);
            }
            catch (Exception _) {}
            Assertions.assertDoesNotThrow(() -> Rectangles.sortByArea(rectangleList));
            Assertions.assertIterableEquals(rectangleListExpected, rectangleList);
            Assertions.assertDoesNotThrow(() -> Rectangles.sortByArea(rectangleArray));
            Assertions.assertArrayEquals(rectangleArrayExpected, rectangleArray);
        }
    }
}
