public class NegativeOnTheRight {

    // 13.1) Написать алгоритм NegativeOnTheRight, который принимает на вход массив целых чисел,
    // и возвращает массив,  в котором все негативные числа находятся во второй половине массива
    // Test Data:
    // {4, -3, 7, -12, 5, -2, 9, 4, 12} → {4, 7, 5, 9, 4, 12, -3, -12, -2}
    public int[] negativeOnTheRightAlgoritm(int[] a) {
        if (a.length > 0) {

            int[] result = new int[a.length];
            int count = 0;

            for (int i = 0; i < a.length; i++) {
                if (a[i] >= 0) {
                    result[count] = a[i];
                    count++;
                }
            }
            for (int i = 0; i < a.length; i++) {
                if (a[i] < 0) {
                    result[count] = a[i];
                    count++;
                }
            }

            return result;

        }

        return new int[]{};
    }
}
