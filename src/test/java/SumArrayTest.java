import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class SumArrayTest {

    // 3) Написать алгоритм SumArray, который возвращает сумму всех чисел массива
    // Test Data:
    // {0, 1, 2, 3, 4, 5} → 15
    // {-7, -3} → -10

    @Order(1)
    @Test
    public void testSumArrayHappyPathPositiveNumber() {
        int[] arryNumber = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        SumArray as = new SumArray();
        int actualResult = as.SumArrayAlgoritm(arryNumber);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testSumArrayHappyPathNegativeNumber() {
        int[] arryNumber = {-7, -3};
        int expectedResult = -10;

        SumArray as = new SumArray();
        int actualResult = as.SumArrayAlgoritm(arryNumber);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumArrayZeroNumber() {
        int[] arryNumber = {};
        int expectedResult = 0;

        SumArray as = new SumArray();
        int actualResult = as.SumArrayAlgoritm(arryNumber);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
