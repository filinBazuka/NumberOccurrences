import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class NumberOccurrencesTest {

    // 15) Написать алгоритм NumberOccurrences,  который принимает на вход массив целых чисел,
    // и возвращает массив пар {число, сколько раз число встречается в массиве}
    // Test Data:
    // {3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1} →
    // {{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}}
    @Order(1)
    @Test
    public void testNumberOccurrencesHappyPath() {
        int[] arry = {3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1};
        int[][] expectedResult = {{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}};

        NumberOccurrences as = new NumberOccurrences();
        int[][] actualResult = as.numberOccurrencesAlgoritm(arry);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testNumberOccurrencesHappyPathNegativeNumber() {
        int[] arry = {-3, -2, -5, -3, -1, -5, -4, -2, -1, -4, -5, -3, -2, -1, -4, -5, -3, -2, -1};
        int[][] expectedResult = {{-5, 4}, {-4, 3}, {-3, 4}, {-2, 4}, {-1, 4}};

        NumberOccurrences as = new NumberOccurrences();
        int[][] actualResult = as.numberOccurrencesAlgoritm(arry);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testNumberOccurrencesHappyPathSmallArray() {
        int[] arry = {-3};
        int[][] expectedResult = {{-3, 1}};

        NumberOccurrences as = new NumberOccurrences();
        int[][] actualResult = as.numberOccurrencesAlgoritm(arry);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testNumberOccurrencesEmptyArray() {
        int[] arry = {};
        int[][] expectedResult = {};

        NumberOccurrences as = new NumberOccurrences();
        int[][] actualResult = as.numberOccurrencesAlgoritm(arry);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
