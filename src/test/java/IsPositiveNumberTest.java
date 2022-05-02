import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class IsPositiveNumberTest {

    // 5) Напишите алгоритм IsPositiveNumber, который возвращает true,
    // если численный  параметр больше или равен нулю,
    // и возвращает false, если параметр меньше 0.
    // Проверьте работу метода на числах 555, 0 и -555.
    @Order(1)
    @Test
    public void testIsPositiveNumberHappyPathAMoreZero() {
        int a = 555;

        IsPositiveNumber as = new IsPositiveNumber();
        boolean actualResult = as.isPositiveNumberAlgoritm(a);

        Assertions.assertTrue(actualResult);
    }

    @Order(2)
    @Test
    public void testIsPositiveNumberHappyPathAEqualsZero() {
        int a = 0;

        IsPositiveNumber as = new IsPositiveNumber();
        boolean actualResult = as.isPositiveNumberAlgoritm(a);

        Assertions.assertTrue(actualResult);
    }

    @Test
    public void testIsPositiveNumberHappyPathALessThanZero() {
        int a = -555;

        IsPositiveNumber as = new IsPositiveNumber();
        boolean actualResult = as.isPositiveNumberAlgoritm(a);

        Assertions.assertFalse(actualResult);
    }
}
