import java.util.Arrays;

public class SortArray {

    // 12) Написать алгоритм SortArray, который принимает на вход массив целых чисел,
    // и сортирует элементы массива в порядке возрастания.
    // Test Data:
    // {4, 3, 7, 12, 5, 2, 9, 4, 12} → {2, 3, 4, 4, 5, 7, 9, 12, 12}

    public int[] sortArrayAlgoritm(int[] a) {
        if (a.length > 1) {
            Arrays.sort(a);

            return a;
        }

        return new int[]{};
    }
}
