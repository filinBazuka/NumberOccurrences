import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class MNumberCheckTest {

    // 7) Для заданного целого числа M выполните следующие условные действия:
    // Если M кратно 3 и 5, вернуть "Good Number".
    // Если M кратно только 3, а не 5, верните "Bad Number".
    // Если M кратно только 5, а не 3, вернуть "Poor Number".
    // Если M не удовлетворяет ни одному из вышеперечисленных условий, верните "-1".
    @Order(1)
    @Test
    public void testMNumberCheckHappyPath3multiple5multiple() {
        int m = 15;
        String expectedResult = "Good Number";

        MNumberCheck as = new MNumberCheck();
        String actualResult = as.mNumberCheckAlgoritm(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testMNumberCheckHappyPath3multiple5NotAMultiple() {
        int m = 9;
        String expectedResult = "Bad Number";

        MNumberCheck as = new MNumberCheck();
        String actualResult = as.mNumberCheckAlgoritm(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testMNumberCheckHappyPath5multiple3NotAMultiple() {
        int m = 10;
        String expectedResult = "Poor Number";

        MNumberCheck as = new MNumberCheck();
        String actualResult = as.mNumberCheckAlgoritm(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMNumberCheckDoesNotSatisfy() {
        int m = 7;
        String expectedResult = "-1";

        MNumberCheck as = new MNumberCheck();
        String actualResult = as.mNumberCheckAlgoritm(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
