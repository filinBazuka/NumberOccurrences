public class ReverseArray {

    // 11) Написать алгоритм ReverseArray, который принимает на вход массив целых чисел,
    // и возвращает “перевернутый” массив.
    // Test Data:
    // {2, 7, 3, 10} → {10, 3, 7, 2}

    public int[] reverseArrayAlgoritm(int[] a) {
        if (a.length > 1) {
            int[] result = new int[a.length];
            int count = a.length - 1;
            for (int i = 0; i < a.length; i++) {
                result[count] = a[i];
                count--;
            }

            return result;
        }

        return new int[]{};
    }
}
