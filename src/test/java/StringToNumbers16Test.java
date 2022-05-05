import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class StringToNumbers16Test {

    // 16.3) Удалить всё кроми цифр

    @Order(1)
    @Test
    public void testStringToNumbers16HappyPathRemoveAllButNumbers() {
        String a = " ЯяЯ2АаdeLA 1/13{]  ";
        String expectedResult = "2113";

        StringToNumbers16 as = new StringToNumbers16();
        String actualResult = as.stringToNumbers16Algoritm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbers16EmptyLines() {
        String a = "";
        String expectedResult = "";

        StringToNumbers16 as = new StringToNumbers16();
        String actualResult = as.stringToNumbers16Algoritm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
