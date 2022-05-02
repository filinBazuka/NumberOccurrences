public class MNumberCheck {

    // 7) Для заданного целого числа M выполните следующие условные действия:
    // Если M кратно 3 и 5, вернуть "Good Number".
    // Если M кратно только 3, а не 5, верните "Bad Number".
    // Если M кратно только 5, а не 3, вернуть "Poor Number".
    // Если M не удовлетворяет ни одному из вышеперечисленных условий, верните "-1".

    public String mNumberCheckAlgoritm(int m) {
        String goodNumber = "Good Number";
        String badNumber = "Bad Number";
        String poorNumber = "Poor Number";
        String doesNotSatisfy = "-1";

        if (m % 3 == 0 && m % 5 == 0) {

            return goodNumber;
        }
        if (m % 3 == 0 && m % 5 != 0){

            return badNumber;
        }
        if (m % 3 != 0 && m % 5 == 0){

            return poorNumber;
        }

        return doesNotSatisfy;
    }
}
