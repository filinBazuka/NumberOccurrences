public class StartsWithLetter {

    // 18) Написать алгоритм StartsWithLetter, который принимает на вход текст,
    // и возвращает в виде строки все слова, которые начинаются с буквы l.

    public String startsWithLetterAlgoritm(String text, String letter) {
        String result = "";

        if (text != "" && letter.length() == 1) {
            String[] textArry = text.split("[,. \n]"); // Курим мануал "Регулярные выражения в Java"
            String capital = letter.toUpperCase();
            String low = letter.toLowerCase();

            String ass = ", ";
            for (int i = 0; i < textArry.length; i++) {
                if (textArry[i].length() >= letter.length()
                        && (String.valueOf(textArry[i].charAt(0)).equals(capital)
                        || String.valueOf(textArry[i].charAt(0)).equals(low))) {
                    result += textArry[i].concat(ass);
                }
            }
            result = result.substring(0, result.length() - 2);

            return result;
        }

        return result;
    }
}
