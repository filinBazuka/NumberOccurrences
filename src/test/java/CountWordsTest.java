import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class CountWordsTest {

    // 17) Напишите алгоритм CountWords, который принимает на вход текст и слово,
    // и считает все вариации этого слова в тексте:

    @Order(1)
    @Test
    public void testCountWordsHappyPathWordSearch1() {
        String word = "Java";
        String text = "As of March 2022, Java 18 is the latest version, while Java 17, " +
                "11 and 8 are the current long-term support (LTS) versions. Oracle released " +
                "the last zero-cost public update for the legacy version Java 8 LTS in January " +
                "2019 for commercial java use, although it will otherwise still support Java 8 with " +
                "public updates for personal use indefinitely. Other vendors have begun to offer " +
                "zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other " +
                "upgrades.";
        int expectedResult = 5;

        CountWords as = new CountWords();
        int actualResult = as.testCountWordsAlgoritm(text, word);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testCountWordsHappyPathWordSearch2() {
        String word = "version";
        String text = "As of March 2022, Java 18 is the latest version, while Java 17, " +
                "11 and 8 are the current long-term support (LTS) versions. Oracle released " +
                "the last zero-cost public update for the legacy version Java 8 LTS in January " +
                "2019 for commercial java use, although it will otherwise still support Java 8 with " +
                "public updates for personal use indefinitely. Other vendors have begun to offer " +
                "zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other " +
                "upgrades.";
        int expectedResult = 2;

        CountWords as = new CountWords();
        int actualResult = as.testCountWordsAlgoritm(text, word);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testCountWordsHappyPathTheWordIsMissing() {
        String word = "filin";
        String text = "As of March 2022, Java 18 is the latest version, while Java 17, " +
                "11 and 8 are the current long-term support (LTS) versions. Oracle released " +
                "the last zero-cost public update for the legacy version Java 8 LTS in January " +
                "2019 for commercial java use, although it will otherwise still support Java 8 with " +
                "public updates for personal use indefinitely. Other vendors have begun to offer " +
                "zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other " +
                "upgrades.";
        int expectedResult = 0;

        CountWords as = new CountWords();
        int actualResult = as.testCountWordsAlgoritm(text, word);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCountWordsEmptyText() {
        String word = "version";
        String text = "";
        int expectedResult = 0;

        CountWords as = new CountWords();
        int actualResult = as.testCountWordsAlgoritm(text, word);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
