import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class SortArrayTest {

    // 12) Написать алгоритм SortArray, который принимает на вход массив целых чисел,
    // и сортирует элементы массива в порядке возрастания.
    // Test Data:
    // {4, 3, 7, 12, 5, 2, 9, 4, 12} → {2, 3, 4, 4, 5, 7, 9, 12, 12}
    @Order(1)
    @Test
    public void testSortArrayHappyPath() {
        int[] a = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int[] expectedResult = {2, 3, 4, 4, 5, 7, 9, 12, 12};

        SortArray as = new SortArray();
        int[] actualResult = as.sortArrayAlgoritm(a);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testSortArrayHappyPathWithTwoValues() {
        int[] a = {4, 3};
        int[] expectedResult = {3, 4};

        SortArray as = new SortArray();
        int[] actualResult = as.sortArrayAlgoritm(a);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSortArrayArrayWithOneValue() {
        int[] a = {4};
        int[] expectedResult = {};

        SortArray as = new SortArray();
        int[] actualResult = as.sortArrayAlgoritm(a);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSortArrayEmptyArray() {
        int[] a = {};
        int[] expectedResult = {};

        SortArray as = new SortArray();
        int[] actualResult = as.sortArrayAlgoritm(a);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
