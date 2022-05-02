import java.util.Arrays;
import java.util.Collection;

public class KthLargest {

    // 13) Написать алгоритм KthLargest, который принимает на вход массив целых чисел и число k,
    // и возвращает k-тый максимальный элемент.
    // Test Data:
    // ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 3) → 9
    // (12 и 12 - первый и второй самые большие элементы)
    public int kthLargestAlgoritm(int[] a, int k) {
        int result = 0;

        if (a.length > 0 && k > 0) {
            Arrays.sort(a);
            result = a[a.length - k];
            return result;
        }

        return result;

    }
}
