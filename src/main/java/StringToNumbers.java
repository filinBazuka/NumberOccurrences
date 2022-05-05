public class StringToNumbers {

    // 15) Написать алгоритм StringToNumbers, который принимает строку, и возвращает массив чисел:
    // Test Data:
    // “1, 2, 3, 4, 5” → {1, 2, 3, 4, 5}
    // (Без форматирования)

    public int[] stringToNumbersAlgoritm(String numbers) {
        if (numbers != "") {
            int count = 0;
            for (int i = 0; i < numbers.length(); i++) {
                if (numbers.charAt(i) > 47 && numbers.charAt(i) < 58) {
                    count++;
                }
            }
            int[] result = new int[count];
            count = 0;
            for (int i = 0; i < numbers.length(); i++) {
                if (numbers.charAt(i) > 47 && numbers.charAt(i) < 58) {
                    result[count] = Integer.parseInt(String.valueOf(numbers.charAt(i))); // При помощи
                    // "Integer.parseInt(String.valueOf())" приобразовываем значение символа строки "numbers",
                    // используя таблицу "ASCII" в значение "int"
                    count++;
                }
            }

            return result;
        }

        return new int[]{};
    }
}
