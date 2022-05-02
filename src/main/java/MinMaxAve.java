public class MinMaxAve {

    // 8) Написать алгоритм MinMaxAve, который принимает массив чисел int[]
    // и 2 значения индексов. Алгоритм возвращает массив,
    // который содержит минимальное значение, максимальное значение,
    // и среднее среди всех значений между 2-мя индексами.
    // Test Data:
    // ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}

    public double[] minMaxAveAlgoritm(int[] numbers, int min, int max) {
        if (numbers.length > 0 && min <= max && min >= 0) {

            int minimumNumber = numbers[min];
            int maximumNumber = numbers[min];
            int sum = 0;
            int count = 0;

            for (int i = min; i <= max; i++) {
                if (minimumNumber > numbers[i]) {
                    minimumNumber = numbers[i];
                }
            }

            for (int i = min; i <= max; i++) {
                if (maximumNumber < numbers[i]) {
                    maximumNumber = numbers[i];
                }
            }

            for (int i = min; i <= max; i++) {
                sum += numbers[i];
                count++;
            }

            double average = (double) sum / count;
            System.out.format("%.1f", average);
            double[] result = {minimumNumber, maximumNumber, average};

            return result;
        }

        return new double[]{};
    }
}
