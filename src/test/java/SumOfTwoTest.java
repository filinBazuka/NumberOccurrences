import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class SumOfTwoTest {

    // 14) Написать алгоритм SumOfTwo, который принимает на вход массив целых чисел, и число n.
    // Алгоритм  возвращает пары элементов, которые в сумме дают число n.
    // Test Data:
    // ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 12)  → {{3, 9},
    //                                         {7, 5}}
    @Order(1)
    @Test
    public void testSumOfTwoHappyPath() {
        int sum = 12;
        int[] arry = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int[][] expectedResult = {{3, 9}, {7, 5}};

        SumOfTwo as = new SumOfTwo();
        int[][] actualResult = as.sumOfTwoAlgoritm(arry, sum);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testSumOfTwoHappyPathThereIsNoPairThatIsEqualToTheSum() {
        int sum = 1;
        int[] arry = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int[][] expectedResult = {};

        SumOfTwo as = new SumOfTwo();
        int[][] actualResult = as.sumOfTwoAlgoritm(arry, sum);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Order(3)
    @Test
    public void testSumOfTwoHappyPathSmallArrayWithTheSameValues() {
        int sum = 8;
        int[] arry = {4, 4};
        int[][] expectedResult = {{4, 4}};

        SumOfTwo as = new SumOfTwo();
        int[][] actualResult = as.sumOfTwoAlgoritm(arry, sum);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumOfTwoEmptyArray() {
        int sum = 12;
        int[] arry = {};
        int[][] expectedResult = {};

        SumOfTwo as = new SumOfTwo();
        int[][] actualResult = as.sumOfTwoAlgoritm(arry, sum);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
