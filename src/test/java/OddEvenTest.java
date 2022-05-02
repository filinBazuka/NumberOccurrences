import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class OddEvenTest {

    // 1) Создать алгоритм OddEven, который принимает на вход целое число, возвращает “Odd”,
    // если число нечетное, и “Even”, если число четное. Во всех остальных случаях результат будет “Undefined”.
    // Test Data:
    // -345 →  “Odd”
    // 0 →  “Even”
    // 222222 →  “Even”
    // 2147483647 + 1 →  “Undefined”
    @Order(1)
    @Test
    public void testOddEvenHappyPathPositiveOddNumber() {
        long number = 1;
        String expectedResult = "Odd";

        OddEven as = new OddEven();
        String actualResult = as.oddEvenAlgoritm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testOddEvenHappyPathPositiveEvenNumber() {
        long number = 2;
        String expectedResult = "Even";

        OddEven as = new OddEven();
        String actualResult = as.oddEvenAlgoritm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testOddEvenHappyPathNegativeOddNumber() {
        long number = -1;
        String expectedResult = "Odd";

        OddEven as = new OddEven();
        String actualResult = as.oddEvenAlgoritm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testOddEvenHappyPathNegativeEvenNumber() {
        long number = -2;
        String expectedResult = "Even";

        OddEven as = new OddEven();
        String actualResult = as.oddEvenAlgoritm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testOddEvenHappyPathZeroNumber() {
        long number = 0;
        String expectedResult = "Even";

        OddEven as = new OddEven();
        String actualResult = as.oddEvenAlgoritm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEvenNegativeUndefined() {
        long number = -2147483649L;
        String expectedResult = "Undefined";

        OddEven as = new OddEven();
        String actualResult = as.oddEvenAlgoritm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEvenPositiveUndefined() {
        long number = 2147483648L;
        String expectedResult = "Undefined";

        OddEven as = new OddEven();
        String actualResult = as.oddEvenAlgoritm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
