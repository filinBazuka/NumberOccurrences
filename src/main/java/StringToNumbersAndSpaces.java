public class StringToNumbersAndSpaces {

    // 16.4) Удалить всё кроми цифр и пробелов

    public String stringToNumbersAndSpacesAlgoritm(String numbers) {
        if (numbers != "") {
//            char a = 'я'; // Искал цифравое значение символа из таблицы "ascii"
//            System.out.println((int)a);
            String result = "";
            for (int i = 0; i < numbers.length(); i++) {
                if ((numbers.charAt(i) > 47 && numbers.charAt(i) < 58) // цифры из "ascii"
                        || numbers.charAt(i) == 32) { // пробел в "ascii"
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
