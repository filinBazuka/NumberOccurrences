public class StringToLetters {

    // 16.1) Удалить всё кроми букв

    public String stringToLettersAlgoritm(String letters) {
        if (letters != "") {
//            char a = 'я'; // Искал цифравое значение символа из таблицы "ascii" (русских букв)
//            System.out.println((int)a);
            String result = "";
            for (int i = 0; i < letters.length(); i++) {
                if ((letters.charAt(i) > 64 && letters.charAt(i) < 91) // Большие латинские
                        || (letters.charAt(i) > 96 && letters.charAt(i) < 123) // Малые латинские
                        || (letters.charAt(i) > 1039 && letters.charAt(i) < 1104)) { // ВСЕ русские
                    result = result.concat(String.valueOf(Character.toChars(letters.charAt(i))));
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
