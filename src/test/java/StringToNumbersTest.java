import org.junit.jupiter.api.*;

import java.util.Arrays;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class StringToNumbersTest {

    // 15) Написать алгоритм StringToNumbers, который принимает строку, и возвращает массив чисел:
    // Test Data:
    // “1, 2, 3, 4, 5” → {1, 2, 3, 4, 5}
    // (Без форматирования)

    @Order(1)
    @Test
    public void testStringToNumbersHappyPathStandard() {
        String numbers = "1, 2, 3, 4, 5";
        int[] expectedResult = {1, 2, 3, 4, 5};

        StringToNumbers as = new StringToNumbers();
        int[] actualResult = as.stringToNumbersAlgoritm(numbers);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testStringToNumbersHappyPathArbitrarySpaces() {
        String numbers = "  1, 2   , 3, 4  , 5";
        int[] expectedResult = {1, 2, 3, 4, 5};

        StringToNumbers as = new StringToNumbers();
        int[] actualResult = as.stringToNumbersAlgoritm(numbers);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testStringToNumbersHappyPathArbitraryLetters() {
        String numbers = "  A1, 2   ,cbh 3, 4 lhg 5";
        int[] expectedResult = {1, 2, 3, 4, 5};

        StringToNumbers as = new StringToNumbers();
        int[] actualResult = as.stringToNumbersAlgoritm(numbers);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testStringToNumbersHappyPathNumbersAreOutOfOrder() {
        String numbers = " 3 0 A1, 2  9 ,cbh , 4 lhg 53";
        int[] expectedResult = {3, 0, 1, 2, 9, 4, 5, 3};

        StringToNumbers as = new StringToNumbers();
        int[] actualResult = as.stringToNumbersAlgoritm(numbers);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testStringToNumbersHappyPathStringOfLetters() {
        String numbers = "   A,   ,cbh ,  lhg ";
        int[] expectedResult = {};

        StringToNumbers as = new StringToNumbers();
        int[] actualResult = as.stringToNumbersAlgoritm(numbers);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersHappyPathEmptyLine() {
        String numbers = "";
        int[] expectedResult = {};

        StringToNumbers as = new StringToNumbers();
        int[] actualResult = as.stringToNumbersAlgoritm(numbers);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
