import java.util.Arrays;

public class Intersection {

    // 9) Написать алгоритм Intersection, который принимает на вход 2 массива целых чисел
    // и возвращает массив общих элементов.
    // Test Data:
    // {1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
    // {1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
    // {1, 2, 4, 5, 89}, {8, 9, 45} → {}

    public int[] intersectionAlgoritm(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    a[j] = -2147483648;
                }
            }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = i + 1; j < b.length; j++) {
                if (b[i] == b[j]) {
                    b[j] = -2147483648;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < a.length; i++) { // {1, 2, 4, 5, 89}, {1, 9, 4, 2} → {2, 4}
            for (int j = 0; j < b.length; j++) {
                if (b[j] == a[i] && a[i] != -2147483648 && b[j] != -2147483648) {
                    count++;
                    break;
                }
            }
        }
        if (count == 0) {

            return new int[]{};

        } else {
            int[] result = new int[count];
            count = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b.length; j++) {
                    if (b[j] == a[i] && a[i] != -2147483648 && b[j] != -2147483648) {
                        result[count] = a[i];
                        count++;
                        break;
                    }
                }
            }

            return result;
        }
    }
}
