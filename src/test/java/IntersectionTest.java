import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class IntersectionTest {

    // 9) Написать алгоритм Intersection, который принимает на вход 2 массива целых чисел
    // и возвращает массив общих элементов.
    // Test Data:
    // {1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
    // {1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
    // {1, 2, 4, 5, 89}, {8, 9, 45} → {}
    @Order(1)
    @Test
    public void testIntersectionHappyPathPositiveNumber() {
        int[] firstArray = {1, 2, 4, 5, 89};
        int[] secondArray = {8, 9, 4, 2};
        int[] expectedResult = {2, 4};

        Intersection as = new Intersection();
        int[] actualResult = as.intersectionAlgoritm(firstArray, secondArray);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testIntersectionHappyPathNegativeNumber() {
        int[] firstArray = {1, 2, 4, 5, 8, 9};
        int[] secondArray = {8, 9, -4, -2};
        int[] expectedResult = {8, 9};

        Intersection as = new Intersection();
        int[] actualResult = as.intersectionAlgoritm(firstArray, secondArray);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testIntersectionHappyPathNoMatchesNumber() {
        int[] firstArray = {1, 2, 4, 5, 89};
        int[] secondArray = {8, 9, 45};
        int[] expectedResult = {};

        Intersection as = new Intersection();
        int[] actualResult = as.intersectionAlgoritm(firstArray, secondArray);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntersectionFirstOfTheArraysIsEmpty() {
        int[] firstArray = {};
        int[] secondArray = {8, 9, 45};
        int[] expectedResult = {};

        Intersection as = new Intersection();
        int[] actualResult = as.intersectionAlgoritm(firstArray, secondArray);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntersectionSecondOfTheArraysIsEmpty() {
        int[] firstArray = {1, 2, 4, 5, 89};
        int[] secondArray = {};
        int[] expectedResult = {};

        Intersection as = new Intersection();
        int[] actualResult = as.intersectionAlgoritm(firstArray, secondArray);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntersectionManyDuplicatesInFirstArray() {
        int[] firstArray = {1, 2, 4, 5, 89, 4, 4, 2};
        int[] secondArray = {8, 9, 4, 2};
        int[] expectedResult = {2, 4};

        Intersection as = new Intersection();
        int[] actualResult = as.intersectionAlgoritm(firstArray, secondArray);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntersectionManyDuplicatesInSecondArray() {
        int[] firstArray = {1, 2, 4, 5, 89};
        int[] secondArray = {8, 9, 4, 2, 9, 8, 4, 2, 2};
        int[] expectedResult = {2, 4};

        Intersection as = new Intersection();
        int[] actualResult = as.intersectionAlgoritm(firstArray, secondArray);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntersectionBothArraysHaveDuplicates() {
        int[] firstArray = {1, 2, 4, 5, 89, 89, 2, 2, 4};
        int[] secondArray = {8, 9, 4, 2, 9, 8, 4, 2, 2};
        int[] expectedResult = {2, 4};

        Intersection as = new Intersection();
        int[] actualResult = as.intersectionAlgoritm(firstArray, secondArray);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
