import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class RemoveDuplicatesTest {

    // 20) Написать алгоритм RemoveDuplicates, который принимает строку и возвращает строку уникальных букв:
    // “AABBCCaabbcc” → “abc”

    @Order(1)
    @Test
    public void testRemoveDuplicatesHappyPath() {
        String text = "AABBCCaabbcc";
        String expectedResult = "abc";

        RemoveDuplicates as = new RemoveDuplicates();
        String actualResult = as.removeDuplicatesAlgoritm(text);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testRemoveDuplicatesHappyPathThereAreOriginals() {
        String text = "AABZBCCaabybcc";
        String expectedResult = "abzcy";

        RemoveDuplicates as = new RemoveDuplicates();
        String actualResult = as.removeDuplicatesAlgoritm(text);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveDuplicatesEmptyLine() {
        String text = "";
        String expectedResult = "";

        RemoveDuplicates as = new RemoveDuplicates();
        String actualResult = as.removeDuplicatesAlgoritm(text);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
