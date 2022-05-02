import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class KthLargestTest {

    // 13) Написать алгоритм KthLargest, который принимает на вход массив целых чисел и число k,
    // и возвращает k-тый максимальный элемент.
    // Test Data:
    // ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 3) → 9
    // (12 и 12 - первый и второй самые большие элементы)
    @Order(1)
    @Test
    public void testKthLargestHappyPath() {
        int k = 3;
        int[] arry = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int expectedResult = 9;

        KthLargest as = new KthLargest();
        int actualResult = as.kthLargestAlgoritm(arry, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testKthLargestHappyPathOneCellArray() {
        int k = 1;
        int[] arry = {4};
        int expectedResult = 4;

        KthLargest as = new KthLargest();
        int actualResult = as.kthLargestAlgoritm(arry, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testKthLargestKEqualsZero() {
        int k = 0;
        int[] arry = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int expectedResult = 0;

        KthLargest as = new KthLargest();
        int actualResult = as.kthLargestAlgoritm(arry, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testKthLargestNullArray() {
        int k = 3;
        int[] arry = {};
        int expectedResult = 0;

        KthLargest as = new KthLargest();
        int actualResult = as.kthLargestAlgoritm(arry, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
