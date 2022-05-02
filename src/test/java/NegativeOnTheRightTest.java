import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class NegativeOnTheRightTest {

    // 13.1) Написать алгоритм NegativeOnTheRight, который принимает на вход массив целых чисел,
    // и возвращает массив,  в котором все негативные числа находятся во второй половине массива
    // Test Data:
    // {4, -3, 7, -12, 5, -2, 9, 4, 12} → {4, 7, 5, 9, 4, 12, -3, -12, -2}
    @Order(1)
    @Test
    public void testNegativeOnTheRightTestHappyPath() {
        int[] arry = {4, -3, 7, -12, 5, -2, 9, 4, 12};
        int[] expectedResult = {4, 7, 5, 9, 4, 12, -3, -12, -2};

        NegativeOnTheRight as = new NegativeOnTheRight();
        int[] actualResult = as.negativeOnTheRightAlgoritm(arry);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testNegativeOnTheRightTestHappyPathPositive1Number() {
        int[] arry = {4};
        int[] expectedResult = {4};

        NegativeOnTheRight as = new NegativeOnTheRight();
        int[] actualResult = as.negativeOnTheRightAlgoritm(arry);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testNegativeOnTheRightTestHappyPathNegative1Number() {
        int[] arry = {-4};
        int[] expectedResult = {-4};

        NegativeOnTheRight as = new NegativeOnTheRight();
        int[] actualResult = as.negativeOnTheRightAlgoritm(arry);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testNegativeOnTheRightTestArraysIsEmpty() {
        int[] arry = {};
        int[] expectedResult = {};

        NegativeOnTheRight as = new NegativeOnTheRight();
        int[] actualResult = as.negativeOnTheRightAlgoritm(arry);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
