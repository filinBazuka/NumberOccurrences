public class OddIndices {

    // 2)  Написать алгоритм OddIndices, который принимает массив чисел,
    // и возвращает массив значений нечетных индексов
    // Input = {-45, 590, 234, 985, 12, 68}
    // Expected Result =  {590, 985, 68}
    public int[] OddIndicesAlgoritm(int[] number) {
        if (number.length >= 1) {
            int counter = 0;
            for (int i = 1; i < number.length; i += 2) {
                counter++;
            }
            int[] result = new int[counter];
            counter = 0;
            for (int i = 1; i < number.length; i += 2) {
                result[counter] = number[i];
                counter++;
            }

            return result;
        }

        return new int[]{};
    }
}
