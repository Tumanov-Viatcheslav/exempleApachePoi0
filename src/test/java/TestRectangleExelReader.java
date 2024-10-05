import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.spi.LoggingEvent;
import org.junit.jupiter.api.*;
import readExel.rectangles.Rectangle;
import readExel.rectangles.RectangleExelReader;

import java.util.ArrayList;
import java.util.List;


public class TestRectangleExelReader {

    @BeforeEach
    void testStarted(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName() + "\n============[started]============");
    }

    @AfterEach
    void testEnded() {
        System.out.println("==========[Test ended]===========\n");
    }

    @Nested
    @DisplayName("Test showRectanglesFromExelFile")
    public class TestShowRectanglesFromExelFile {

        @BeforeAll
        static void testShowRectanglesFromExelFileStarted() {
            System.out.println("[Testing showRectanglesFromExelFile started]");
        }

        @AfterAll
        static void testShowRectanglesFromExelFileEnded() {
            System.out.println("[Testing showRectanglesFromExelFile ended]");
        }

        @Test
        @DisplayName("Test FileNotFoundException: ")
        void test1() {
            Assertions.assertDoesNotThrow(() -> RectangleExelReader.showRectanglesFromExelFile("a.xlsx"));
        }

        @Test
        @DisplayName("Test wrong number of arguments: ")
        void test2() {
            BasicConfigurator.configure(new AppenderSkeleton() {
                @Override
                protected void append(LoggingEvent event) {

                }

                @Override
                public void close() {

                }

                @Override
                public boolean requiresLayout() {
                    return false;
                }
            });
            Assertions.assertDoesNotThrow(() -> RectangleExelReader.showRectanglesFromExelFile("src/test/resources/rectangle_exel_reader_test_input/inputWrongNumberOfArguments.xlsx"));
        }

        @Test
        @DisplayName("Test wrong parameters format: ")
        void test3() {
            BasicConfigurator.configure(new AppenderSkeleton() {
                @Override
                protected void append(LoggingEvent event) {

                }

                @Override
                public void close() {

                }

                @Override
                public boolean requiresLayout() {
                    return false;
                }
            });
            Assertions.assertDoesNotThrow(() -> RectangleExelReader.showRectanglesFromExelFile("src/test/resources/rectangle_exel_reader_test_input/inputInvalidParameters.xlsx"));
        }

        @Test
        @DisplayName("Test empty: ")
        void test4() {
            BasicConfigurator.configure(new AppenderSkeleton() {
                @Override
                protected void append(LoggingEvent event) {

                }

                @Override
                public void close() {

                }

                @Override
                public boolean requiresLayout() {
                    return false;
                }
            });
            Assertions.assertDoesNotThrow(() -> RectangleExelReader.showRectanglesFromExelFile("src/test/resources/rectangle_exel_reader_test_input/inputEmpty.xlsx"));
        }

        @Test
        @DisplayName("Test GeometryExceptions: ")
        void test5() {
            BasicConfigurator.configure(new AppenderSkeleton() {
                @Override
                protected void append(LoggingEvent event) {

                }

                @Override
                public void close() {

                }

                @Override
                public boolean requiresLayout() {
                    return false;
                }
            });
            Assertions.assertDoesNotThrow(() -> RectangleExelReader.showRectanglesFromExelFile("src/test/resources/rectangle_exel_reader_test_input/inputGeometryExceptions.xlsx"));
        }

        @Test
        @DisplayName("Test correct: ")
        void testCorrect() {
            BasicConfigurator.configure(new AppenderSkeleton() {
                @Override
                protected void append(LoggingEvent event) {

                }

                @Override
                public void close() {

                }

                @Override
                public boolean requiresLayout() {
                    return false;
                }
            });
            Assertions.assertDoesNotThrow(() -> RectangleExelReader.showRectanglesFromExelFile("src/test/resources/rectangle_exel_reader_test_input/input1.xlsx"));
        }
    }

    @Nested
    @DisplayName("Test readRectanglesFromExelFile")
    public class TestReadRectanglesFromExelFile {

        @BeforeAll
        static void testReadRectanglesFromExelFileStarted() {
            System.out.println("[Testing readRectanglesFromExelFile started]");
        }

        @AfterAll
        static void testReadRectanglesFromExelFileEnded() {
            System.out.println("[Testing readRectanglesFromExelFile ended]");
        }

        @Test
        @DisplayName("Test FileNotFoundException: ")
        void test1() {
            Assertions.assertDoesNotThrow(() -> RectangleExelReader.readRectanglesFromExelFile("a.xlsx"));
        }

        @Test
        @DisplayName("Test wrong number of arguments: ")
        void test2() {
            BasicConfigurator.configure(new AppenderSkeleton() {
                @Override
                protected void append(LoggingEvent event) {

                }

                @Override
                public void close() {

                }

                @Override
                public boolean requiresLayout() {
                    return false;
                }
            });
            List<Rectangle> rectangles = Assertions.assertDoesNotThrow(() -> RectangleExelReader.readRectanglesFromExelFile("src/test/resources/rectangle_exel_reader_test_input/inputWrongNumberOfArguments.xlsx"));
            List<Rectangle> rectanglesExpected = new ArrayList<>();
            try {
                rectanglesExpected.add(new Rectangle(1015, 15));
                rectanglesExpected.add(new Rectangle(55, 44));
            } catch (Exception _) {}
            Assertions.assertIterableEquals(rectanglesExpected, rectangles);
        }

        @Test
        @DisplayName("Test wrong parameters format: ")
        void test3() {
            BasicConfigurator.configure(new AppenderSkeleton() {
                @Override
                protected void append(LoggingEvent event) {

                }

                @Override
                public void close() {

                }

                @Override
                public boolean requiresLayout() {
                    return false;
                }
            });
            List<Rectangle> rectangles = Assertions.assertDoesNotThrow(() -> RectangleExelReader.readRectanglesFromExelFile("src/test/resources/rectangle_exel_reader_test_input/inputInvalidParameters.xlsx"));
            List<Rectangle> rectanglesExpected = new ArrayList<>();
            try {
                rectanglesExpected.add(new Rectangle(1015, 15));
                rectanglesExpected.add(new Rectangle(55, 44));
            } catch (Exception _) {}
            Assertions.assertIterableEquals(rectanglesExpected, rectangles);
        }

        @Test
        @DisplayName("Test empty: ")
        void test4() {
            BasicConfigurator.configure(new AppenderSkeleton() {
                @Override
                protected void append(LoggingEvent event) {

                }

                @Override
                public void close() {

                }

                @Override
                public boolean requiresLayout() {
                    return false;
                }
            });
            List<Rectangle> rectangles = Assertions.assertDoesNotThrow(() -> RectangleExelReader.readRectanglesFromExelFile("src/test/resources/rectangle_exel_reader_test_input/inputEmpty.xlsx"));
            List<Rectangle> rectanglesEmpty = new ArrayList<>();
            Assertions.assertIterableEquals(rectanglesEmpty, rectangles);
        }

        @Test
        @DisplayName("Test GeometryExceptions: ")
        void test5() {
            BasicConfigurator.configure(new AppenderSkeleton() {
                @Override
                protected void append(LoggingEvent event) {

                }

                @Override
                public void close() {

                }

                @Override
                public boolean requiresLayout() {
                    return false;
                }
            });
            List<Rectangle> rectangles = Assertions.assertDoesNotThrow(() -> RectangleExelReader.readRectanglesFromExelFile("src/test/resources/rectangle_exel_reader_test_input/inputGeometryExceptions.xlsx"));
            List<Rectangle> rectanglesExpected = new ArrayList<>();
            try {
                rectanglesExpected.add(new Rectangle(1015, 15));
                rectanglesExpected.add(new Rectangle(10, 15));
            } catch (Exception _) {}
            Assertions.assertIterableEquals(rectanglesExpected, rectangles);
        }

        @Test
        @DisplayName("Test correct: ")
        void testCorrect() {
            BasicConfigurator.configure(new AppenderSkeleton() {
                @Override
                protected void append(LoggingEvent event) {

                }

                @Override
                public void close() {

                }

                @Override
                public boolean requiresLayout() {
                    return false;
                }
            });
            List<Rectangle> rectangles = Assertions.assertDoesNotThrow(() -> RectangleExelReader.readRectanglesFromExelFile("src/test/resources/rectangle_exel_reader_test_input/input1.xlsx"));
            List<Rectangle> rectanglesExpected = new ArrayList<>();
            try {
                rectanglesExpected.add(new Rectangle(1015, 15));
                rectanglesExpected.add(new Rectangle(55, 15));
                rectanglesExpected.add(new Rectangle(23, 32));
                rectanglesExpected.add(new Rectangle(55, 44));
            } catch (Exception _) {}
            Assertions.assertIterableEquals(rectanglesExpected, rectangles);
        }
    }
}
