import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class AreNumbersEqualTest {

    // 6) Напишите алгоритм AreNumbersEqual, который принимает на вход 2 любых int числа,
    // и возвращает 0, если числа равны
    // -1, если первое число меньше второго
    // 1, если первое число больше второго
    // Test Data:
    // 89, 89
    //Expected result: 0
    //-89, 89
    //Expected result: -1
    //89, -89
    //Expected result: 1

    @Order(1)
    @Test
    public void testAreNumbersEqualHappyPathAEqualsBNumber() {
        int a = 89;
        int b = 89;
        int expectedResult = 0;

        AreNumbersEqual as = new AreNumbersEqual();
        int actualResult = as.areNumbersEqualAlgoritm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testAreNumbersEqualHappyPathBMoreANumber() {
        int a = -89;
        int b = 89;
        int expectedResult = -1;

        AreNumbersEqual as = new AreNumbersEqual();
        int actualResult = as.areNumbersEqualAlgoritm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testAreNumbersEqualHappyPathAMoreBNumber() {
        int a = 89;
        int b = -89;
        int expectedResult = 1;

        AreNumbersEqual as = new AreNumbersEqual();
        int actualResult = as.areNumbersEqualAlgoritm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
