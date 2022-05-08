import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class StringIntersectionTest {

    // 21) Написать алгоритм StringIntersection,  который принимает на вход 2 строки
    // и возвращает общее вхождение в этих строках
    // Test Data:
    // “Carrot”, “carwash” → “car”
    // “Noob”, “Schmooze” → “oo”

    @Order(1)
    @Test
    public void testStringIntersectionHappyPath1() {
        String text1 = "Carrot";
        String text2 = "carwash";
        String expectedResult = "car";

        StringIntersection as = new StringIntersection();
        String actualResult = as.testStringIntersectionAlgoritm(text1, text2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testStringIntersectionHappyPath2() {
        String text1 = "Noob";
        String text2 = "Schmooze";
        String expectedResult = "oo";

        StringIntersection as = new StringIntersection();
        String actualResult = as.testStringIntersectionAlgoritm(text1, text2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testStringIntersectionHappyPathFirstLineOneCharacter() {
        String text1 = "s";
        String text2 = "Schmooze";
        String expectedResult = "s";

        StringIntersection as = new StringIntersection();
        String actualResult = as.testStringIntersectionAlgoritm(text1, text2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testStringIntersectionHappyPathSecondLineOneCharacter() {
        String text1 = "Noob";
        String text2 = "b";
        String expectedResult = "b";

        StringIntersection as = new StringIntersection();
        String actualResult = as.testStringIntersectionAlgoritm(text1, text2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testStringIntersectionHappyPathMatchesAtTheEndOfAWord() {
        String text1 = "Noob";
        String text2 = "ob";
        String expectedResult = "ob";

        StringIntersection as = new StringIntersection();
        String actualResult = as.testStringIntersectionAlgoritm(text1, text2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testStringIntersectionHappyPathOneOfTheLinesIsEmpty() {
        String text1 = "Noob";
        String text2 = "";
        String expectedResult = "";

        StringIntersection as = new StringIntersection();
        String actualResult = as.testStringIntersectionAlgoritm(text1, text2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringIntersectionEmptyLines() {
        String text1 = "";
        String text2 = "";
        String expectedResult = "";

        StringIntersection as = new StringIntersection();
        String actualResult = as.testStringIntersectionAlgoritm(text1, text2);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
