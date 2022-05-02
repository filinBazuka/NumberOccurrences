import org.junit.jupiter.api.*;

import java.util.Arrays;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class MinMaxAveTest {

    // 8) Написать алгоритм MinMaxAve, который принимает массив чисел int[]
    // и 2 значения индексов. Алгоритм возвращает массив,
    // который содержит минимальное значение, максимальное значение,
    // и среднее среди всех значений между 2-мя индексами.
    // Test Data:
    // ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
    @Order(1)
    @Test
    public void testMinMaxAveHappyPathPositiveNumber() {
        int[] arryNumbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int min = 2;
        int max = 6;
        double[] expectedResult = {3, 7, 5};

        MinMaxAve as = new MinMaxAve();
        double[] actualResult = as.minMaxAveAlgoritm(arryNumbers, min, max);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Order(2)
    @Test
    public void testMinMaxAveHappyPathNegativeNumber() {
        int[] arryNumbers = {-1, -2, -3, -4, -5, -6, -7, -8};
        int min = 2;
        int max = 6;
        double[] expectedResult = {-7, -3, -5};

        MinMaxAve as = new MinMaxAve();
        double[] actualResult = as.minMaxAveAlgoritm(arryNumbers, min, max);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Order(3)
    @Test
    public void testMinMaxAveHappyPathSmallArray() {
        int[] arryNumbers = {4};
        int min = 0;
        int max = 0;
        double[] expectedResult = {4, 4, 4};

        MinMaxAve as = new MinMaxAve();
        double[] actualResult = as.minMaxAveAlgoritm(arryNumbers, min, max);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void testMinMaxAveEmptyArray() {
        int[] arryNumbers = {};
        int min = 2;
        int max = 6;
        double[] expectedResult = {};

        MinMaxAve as = new MinMaxAve();
        double[] actualResult = as.minMaxAveAlgoritm(arryNumbers, min, max);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void testMinMaxAveMinMoreMax() {
        int[] arryNumbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int min = 6;
        int max = 2;
        double[] expectedResult = {};

        MinMaxAve as = new MinMaxAve();
        double[] actualResult = as.minMaxAveAlgoritm(arryNumbers, min, max);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void testMinMaxAveIndexLessThanZero() {
        int[] arryNumbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int min = -6;
        int max = -2;
        double[] expectedResult = {};

        MinMaxAve as = new MinMaxAve();
        double[] actualResult = as.minMaxAveAlgoritm(arryNumbers, min, max);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }
}
