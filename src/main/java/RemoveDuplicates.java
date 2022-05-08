import java.util.Locale;

public class RemoveDuplicates {

    // 20) Написать алгоритм RemoveDuplicates, который принимает строку и возвращает строку уникальных букв:
    // “AABBCCaabbcc” → “abc”

    public String removeDuplicatesAlgoritm(String text) {
        String result = "";
        if (text != "") {
            text = text.toLowerCase();
            for (int i = 0; i < text.length(); ) {
                result += String.valueOf(text.charAt(i));
                text = text.replace(String.valueOf(text.charAt(i)), "");
            }

            return result;
        }

        return result;
    }
}
