import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class BiggerValueTest {

    // 4) Напишите алгоритм BiggerValue, который из двух параметров типа int возвращает бОльшее значение.
    // Test Data:
    // 3333, 9999
    // Expected Result = 9999
    @Order(1)
    @Test
    public void testBiggerValueHappyPathAMoreBNumber() {
        int a = 3333;
        int b = -9999;
        int expectedResult = a;

        BiggerValue as = new BiggerValue();
        int actualResult = as.biggerValueAlgoritm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testBiggerValueHappyPathBMoreANumber() {
        int a = 3333;
        int b = 9999;
        int expectedResult = b;

        BiggerValue as = new BiggerValue();
        int actualResult = as.biggerValueAlgoritm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testBiggerValueAEqualsBNumber() {
        int a = 3333;
        int b = 3333;
        int expectedResult = 0;

        BiggerValue as = new BiggerValue();
        int actualResult = as.biggerValueAlgoritm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
