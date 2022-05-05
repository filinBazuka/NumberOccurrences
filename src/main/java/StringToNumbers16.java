public class StringToNumbers16 {

    // 16.3) Удалить всё кроми цифр

    public String stringToNumbers16Algoritm(String numbers) {
        if (numbers != "") {
//            char a = 'я'; // Искал цифравое значение символа из таблицы "ascii"
//            System.out.println((int)a);
            String result = "";
            for (int i = 0; i < numbers.length(); i++) {
                if ((numbers.charAt(i) > 47 && numbers.charAt(i) < 58)) { // цифры из "ascii"
                    result = result.concat(String.valueOf(Character.toChars(numbers.charAt(i))));
                    // В "result" прибовлял конкатинацией "result.concat()"
                    // "String.valueOf(Character.toChars(letters.charAt(i)))" - переводил содержимое
                    // ячейки "i" по коду из "ascii" в символ.(интеледж помог)
                }
            }

            return result;
        }

        return "";
    }
}
