import org.junit.jupiter.api.*;

import java.util.Arrays;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class OddIndicesTest {

    // 2)  Написать алгоритм OddIndices, который принимает массив чисел,
    // и возвращает массив значений нечетных индексов
    // Input = {-45, 590, 234, 985, 12, 68}
    // Expected Result =  {590, 985, 68}
    @Order(1)
    @Test
    public void testOddIndicesHappyPathPositiveiveNumber() {
        int[] arryNumber = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        OddIndices as = new OddIndices();
        int[] actualResult = as.OddIndicesAlgoritm(arryNumber);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testOddIndicesHappyPathNegativeiveNumber() {
        int[] arryNumber = {-45, -590, -234, -985, -12, -68};
        int[] expectedResult = {-590, -985, -68};

        OddIndices as = new OddIndices();
        int[] actualResult = as.OddIndicesAlgoritm(arryNumber);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndicesOneNumber() {
        int[] arryNumber = {45};
        int[] expectedResult = {};

        OddIndices as = new OddIndices();
        int[] actualResult = as.OddIndicesAlgoritm(arryNumber);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndicesZeroNumber() {
        int[] arryNumber = {};
        int[] expectedResult = {};

        OddIndices as = new OddIndices();
        int[] actualResult = as.OddIndicesAlgoritm(arryNumber);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
