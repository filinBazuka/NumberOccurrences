import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class ReverseStringTest {

    // 19) Написать алгоритм ReverseString, который переворачивает строку:
    // Test Data:
    // “Abracadabra” → “arbadacarbA”

    @Order(1)
    @Test
    public void testReverseStringHappyPath() {
        String text = "Abracadabra";
        String expectedResult = "arbadacarbA";

        ReverseString as = new ReverseString();
        String actualResult = as.reverseStringAlgoritm(text);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testReverseStringHappyPathAnyString() {
        String text = " Abr3ac2ad/abra ";
        String expectedResult = " arba/da2ca3rbA ";

        ReverseString as = new ReverseString();
        String actualResult = as.reverseStringAlgoritm(text);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testReverseString() {
        String text = "";
        String expectedResult = "";

        ReverseString as = new ReverseString();
        String actualResult = as.reverseStringAlgoritm(text);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
