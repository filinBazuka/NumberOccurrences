import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class StringToLettersTest {

    // 16.1) Удалить всё кроми букв

    @Order(1)
    @Test
    public void testStringToLettersHappyPathRemoveAllButLetters() {
        String a = " ЯяЯАаdeLA 1/13{]  ";
        String expectedResult = "ЯяЯАаdeLA";

        StringToLetters as = new StringToLetters();
        String actualResult = as.stringToLettersAlgoritm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToLettersEmptyLine() {
        String a = "";
        String expectedResult = "";

        StringToLetters as = new StringToLetters();
        String actualResult = as.stringToLettersAlgoritm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
