public class ReverseString {

    // 19) Написать алгоритм ReverseString, который переворачивает строку:
    // Test Data:
    // “Abracadabra” → “arbadacarbA”

    public String reverseStringAlgoritm(String text) {
        String result = "";
        if (text != "") {
            for (int i = text.length() - 1; i >= 0; i--) {
                result += String.valueOf(text.charAt(i));
            }

            return result;
        }

        return result;
    }
}
