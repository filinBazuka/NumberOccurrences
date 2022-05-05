import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class StringToLettersAndSpacesTest {

    // 16.2) Удалить всё кроми букв и пробелов

    @Order(1)
    @Test
    public void testStringToLettersHappyPathRemoveAllButLettersAndSpaces() {
        String a = " ЯяЯА  аdeLA 1/13{]  ";
        String expectedResult = " ЯяЯА  аdeLA   ";

        StringToLettersAndSpaces as = new StringToLettersAndSpaces();
        String actualResult = as.stringToLettersAndSpacesAlgoritm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToLettersEmptyLine() {
        String a = "";
        String expectedResult = "";

        StringToLettersAndSpaces as = new StringToLettersAndSpaces();
        String actualResult = as.stringToLettersAndSpacesAlgoritm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
