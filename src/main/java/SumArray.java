public class SumArray {

    // 3) Написать алгоритм SumArray, который возвращает сумму всех чисел массива
    // Test Data:
    // {0, 1, 2, 3, 4, 5} → 15
    // {-7, -3} → -10
    public int SumArrayAlgoritm(int[] number) {
        int sum = 0;

        if (number.length > 0) {
            for (int i = 0; i < number.length; i++) {
                sum += number[i];
            }

            return sum;
        }

        return sum;
    }
}
