public class AreNumbersEqual {

    // 6) Напишите алгоритм AreNumbersEqual, который принимает на вход 2 любых int числа,
    // и возвращает 0, если числа равны
    // -1, если первое число меньше второго
    // 1, если первое число больше второго
    // Test Data:
    // 89, 89
    //Expected result: 0
    //-89, 89
    //Expected result: -1
    //89, -89
    //Expected result: 1

    public int areNumbersEqualAlgoritm(int a, int b) {
        int result = 0;

        if (a != b) {
            if (a < b) {
                result = -1;

                return result;
            } else {
                result = 1;

                return result;
            }
        }

        return result;

    }
}
