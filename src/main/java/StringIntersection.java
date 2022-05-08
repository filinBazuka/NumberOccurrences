import java.util.Locale;

public class StringIntersection {

    // 21) Написать алгоритм StringIntersection,  который принимает на вход 2 строки
    // и возвращает общее вхождение в этих строках
    // Test Data:
    // “Carrot”, “carwash” → “car”
    // “Noob”, “Schmooze” → “oo”

    public String testStringIntersectionAlgoritm(String text1, String text2) {
        String result = "";
        if (text1 != "" && text2 != "") {
            text1 = text1.toLowerCase();
            text2 = text2.toLowerCase();
            String z = "";
            if (text1.length() == 1 || text2.length() == 1) {
                if (text1.length() > text2.length()) {
                    if (text1.contains(text2)) {
                        result = text2;
                    }
                } else {
                    if (text2.contains(text1)) {
                        result = text1;
                    }
                }
            } else {
                for (int i = 0; i < text1.length(); i++) {
                    for (int j = 0; j < text2.length(); j++) {
                        if (String.valueOf(text2.charAt(j)).equals(String.valueOf(text1.charAt(i)))) {
                            if (text2.length() > j + 1 && text1.length() > i + 1) {
                                if (String.valueOf(text2.charAt((j + 1))).equals(String.valueOf(text1.charAt((i + 1))))) {
                                    result += String.valueOf(text1.charAt(i));
                                    z = String.valueOf(text1.charAt(i + 1));
                                }
                            }
                        }
                    }
                }
            }
            result += z;

            return result;
        }

        return result;
    }
}
