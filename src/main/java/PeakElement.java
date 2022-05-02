public class PeakElement {

    // 10) Написать алгоритм PeakElement,  который принимает на вход массив целых чисел
    // и возвращает значения пиковых элементов (элементы, которые больше своих соседей).
    // Test Data:
    // {3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}

    public int[] peakElementAlgoritm(int[] a) {
        if (a.length > 1) {
            int count = 0;

            if (a[0] > a[1]) {
                count++;
            }
            for (int i = 1; i < a.length - 1; i++) {
                if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
                    count++;
                }
            }
            if (a[(a.length - 1)] > a[(a.length - 2)]) {
                count++;
            }

            int[] result = new int[count];

            count = 0;
            if (a[0] > a[1]) {
                result[0] = a[0];
                count++;
            }
            for (int i = 1; i < a.length - 1; i++) {
                if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
                    result[count] = a[i];
                    count++;
                }
            }
            if (a[(a.length - 1)] > a[(a.length - 2)]) {
                result[count] = a[(a.length - 1)];
            }

            return result;
        }

        return new int[]{};
    }

}
