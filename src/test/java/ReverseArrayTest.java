import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class ReverseArrayTest {

    // 11) Написать алгоритм ReverseArray, который принимает на вход массив целых чисел,
    // и возвращает “перевернутый” массив.
    // Test Data:
    // {2, 7, 3, 10} → {10, 3, 7, 2}
    @Order(1)
    @Test
    public void testReverseArrayHappyPath() {
        int[] a = {2, 7, 3, 10};
        int[] expectedResult = {10, 3, 7, 2};

        ReverseArray as = new ReverseArray();
        int[] actualResult = as.reverseArrayAlgoritm(a);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testReverseArrayHappyPathArrayWithTwoValues() {
        int[] a = {2, 7};
        int[] expectedResult = {7, 2};

        ReverseArray as = new ReverseArray();
        int[] actualResult = as.reverseArrayAlgoritm(a);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testReverseArrayArrayWithOneValue() {
        int[] a = {2};
        int[] expectedResult = {};

        ReverseArray as = new ReverseArray();
        int[] actualResult = as.reverseArrayAlgoritm(a);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testReverseArrayEmptyArray() {
        int[] a = {};
        int[] expectedResult = {};

        ReverseArray as = new ReverseArray();
        int[] actualResult = as.reverseArrayAlgoritm(a);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
