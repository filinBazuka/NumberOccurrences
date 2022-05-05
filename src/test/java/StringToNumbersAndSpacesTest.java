import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class StringToNumbersAndSpacesTest {

    // 16.4) Удалить всё кроми цифр и пробелов

    @Order(1)
    @Test
    public void testStringToNumbersAndSpacesHappyPathRemoveAllButNumbersAndSpaces() {
        String a = " ЯяЯ2АаdeLA 1/13{]  ";
        String expectedResult = " 2 113  ";

        StringToNumbersAndSpaces as = new StringToNumbersAndSpaces();
        String actualResult = as.stringToNumbersAndSpacesAlgoritm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersAndSpacesEmptyLines() {
        String a = "";
        String expectedResult = "";

        StringToNumbersAndSpaces as = new StringToNumbersAndSpaces();
        String actualResult = as.stringToNumbersAndSpacesAlgoritm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
