import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class PeakElementTest {

    // 10) Написать алгоритм PeakElement,  который принимает на вход массив целых чисел
    // и возвращает значения пиковых элементов (элементы, которые больше своих соседей).
    // Test Data:
    // {3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}

    @Order(1)
    @Test
    public void testPeakElementHappyPathPeakElement() {
        int[] a = {3, 2, 7, 5, 1, 9, 23, 1};
        int[] expectedResult = {3, 7, 23};

        PeakElement as = new PeakElement();
        int[] actualResult = as.peakElementAlgoritm(a);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testPeakElementHappyPathFirstAndLastMoreNeighbor() {
        int[] a = {3, 2, 7, 5, 1, 9, 1, 23};
        int[] expectedResult = {3, 7, 9, 23};

        PeakElement as = new PeakElement();
        int[] actualResult = as.peakElementAlgoritm(a);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testPeakElementHappyPathFirstAndLastLessNeighbor() {
        int[] a = {2, 3, 7, 5, 1, 9, 23, 1};
        int[] expectedResult = {7, 23};

        PeakElement as = new PeakElement();
        int[] actualResult = as.peakElementAlgoritm(a);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testPeakElementHappyPathNegativePeakElement() {
        int[] a = {-3, -2, -7, -5, -1, -9, -1, -23};
        int[] expectedResult = {-2, -1, -1};

        PeakElement as = new PeakElement();
        int[] actualResult = as.peakElementAlgoritm(a);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testPeakElementEmptyArray() {
        int[] a = {};
        int[] expectedResult = {};

        PeakElement as = new PeakElement();
        int[] actualResult = as.peakElementAlgoritm(a);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testPeakElementOneValue() {
        int[] a = {3};
        int[] expectedResult = {};

        PeakElement as = new PeakElement();
        int[] actualResult = as.peakElementAlgoritm(a);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
