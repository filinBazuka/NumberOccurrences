public class BiggerValue {

    // 4) Напишите алгоритм BiggerValue, который из двух параметров типа int возвращает бОльшее значение.
    // Test Data:
    // 3333, 9999
    // Expected Result = 9999

    public int biggerValueAlgoritm(int a, int b) {
        int more = 0;

        if (a != b) {
            if (a > b) {
                more = a;

                return more;
            } else {
                more = b;

                return more;
            }
        }

        return more;
    }
}
