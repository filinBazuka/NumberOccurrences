import java.util.Arrays;
import java.util.Locale;

public class CountWords {

    // 17) Напишите алгоритм CountWords, который принимает на вход текст и слово,
    // и считает все вариации этого слова в тексте:

    public int testCountWordsAlgoritm(String text, String word) {
        int count = 0;
        if (text != "") {
            String[] textArry = text.split(" ");
            String capital = word.substring(0,1).toUpperCase();
            word = capital.concat(word.substring(1));
            for (int i = 0; i < textArry.length; i++) {
                if (textArry[i].contains(word) && textArry[i].length() == word.length()) {
                    if ((int) textArry[i].charAt(0) > 64 && (int) textArry[i].charAt(0) < 91) {

                        count++;
                    }
                } else if (textArry[i].contains(word) && textArry[i].length() > word.length()) {
                    if (textArry[i].charAt(0) == word.charAt(0)) {
                        if ((int) textArry[i].charAt(0) > 64 && (int) textArry[i].charAt(0) < 91) {
                            if (((int) textArry[i].charAt(word.length()) < 97
                                    || (int) textArry[i].charAt(word.length()) > 122)
                                    && ((int) textArry[i].charAt(word.length()) < 65
                                    || (int) textArry[i].charAt(word.length()) > 90)) {

                                count++;
                            }
                        }
                    }
                }
            }
            word = word.toLowerCase();
            for (int i = 0; i < textArry.length; i++) {
                if (textArry[i].contains(word) && textArry[i].length() == word.length()) {

                    count++;
                } else if (textArry[i].contains(word) && textArry[i].length() > word.length()) {

                    if (textArry[i].charAt(0) == word.charAt(0)) {

                        if ((int) textArry[i].charAt(word.length()) < 97
                                || (int) textArry[i].charAt(word.length()) > 122) {

                            count++;
                        }
                    }
                }
            }

            return count;
        }

        return count;
    }
}
