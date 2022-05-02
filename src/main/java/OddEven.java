public class OddEven {

    // 1) Создать алгоритм OddEven, который принимает на вход целое число, возвращает “Odd”,
    // если число нечетное, и “Even”, если число четное. Во всех остальных случаях результат будет “Undefined”.
    // Test Data:
    // -345 →  “Odd”
    // 0 →  “Even”
    // 222222 →  “Even”
    // 2147483647 + 1 →  “Undefined”
    public String oddEvenAlgoritm(long number) {
        String odd = "Odd";
        String even = "Even";
        String undefined = "Undefined";

        if (number <= 2147483647L && number >= -2147483648L) {
            if (number % 2 == 0) {

                return even;
            } else {

                return odd;
            }
        }

        return undefined;
    }
}
