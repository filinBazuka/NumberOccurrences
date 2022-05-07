import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class StartsWithLetterTest {

    // 18) Написать алгоритм StartsWithLetter, который принимает на вход текст,
    // и возвращает в виде строки все слова, которые начинаются с буквы l.

    @Order(1)
    @Test
    public void testStartsWithLetterHappyPathNotEmptyText() {
        String letter = "l";
        String text = "As a decrepit father takes delight\n" +
                "To see his active child do deeds of youth,\n" +
                "So I, made lame by fortune’s dearest spite,\n" +
                "Take all my comfort of thy worth and truth.\n" +
                "For whether beauty, birth, or wealth, or wit,\n" +
                "Or any of these all, or all, or more,\n" +
                "Entitled in thy parts do crownèd sit,\n" +
                "I make my love engrafted to this store.\n" +
                "So then I am not lame, poor, nor despised,\n" +
                "Whilst that this shadow doth such substance give\n" +
                "That I in thy abundance am sufficed,\n" +
                "And by a part of all thy glory live.\n" +
                "Look what is best, that best I wish in thee.\n" +
                "This wish I have; then ten times happy me.";
        String expectedResult = "lame, love, lame, live, Look";

        StartsWithLetter as = new StartsWithLetter();
        String actualResult = as.testStartsWithLetterAlgoritm(text, letter);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testStartsWithLetterHappyPathCapitalLetter() {
        String letter = "L";
        String text = "As a decrepit father takes delight\n" +
                "To see his active child do deeds of youth,\n" +
                "So I, made lame by fortune’s dearest spite,\n" +
                "Take all my comfort of thy worth and truth.\n" +
                "For whether beauty, birth, or wealth, or wit,\n" +
                "Or any of these all, or all, or more,\n" +
                "Entitled in thy parts do crownèd sit,\n" +
                "I make my love engrafted to this store.\n" +
                "So then I am not lame, poor, nor despised,\n" +
                "Whilst that this shadow doth such substance give\n" +
                "That I in thy abundance am sufficed,\n" +
                "And by a part of all thy glory live.\n" +
                "Look what is best, that best I wish in thee.\n" +
                "This wish I have; then ten times happy me.";
        String expectedResult = "lame, love, lame, live, Look";

        StartsWithLetter as = new StartsWithLetter();
        String actualResult = as.testStartsWithLetterAlgoritm(text, letter);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testStartsWithLetterHappyPathEmptyLetter() {
        String letter = "";
        String text = "As a decrepit father takes delight\n" +
                "To see his active child do deeds of youth,\n" +
                "So I, made lame by fortune’s dearest spite,\n" +
                "Take all my comfort of thy worth and truth.\n" +
                "For whether beauty, birth, or wealth, or wit,\n" +
                "Or any of these all, or all, or more,\n" +
                "Entitled in thy parts do crownèd sit,\n" +
                "I make my love engrafted to this store.\n" +
                "So then I am not lame, poor, nor despised,\n" +
                "Whilst that this shadow doth such substance give\n" +
                "That I in thy abundance am sufficed,\n" +
                "And by a part of all thy glory live.\n" +
                "Look what is best, that best I wish in thee.\n" +
                "This wish I have; then ten times happy me.";
        String expectedResult = "";

        StartsWithLetter as = new StartsWithLetter();
        String actualResult = as.testStartsWithLetterAlgoritm(text, letter);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStartsWithLetterEmptyText() {
        String letter = "l";
        String text = "";
        String expectedResult = "";

        StartsWithLetter as = new StartsWithLetter();
        String actualResult = as.testStartsWithLetterAlgoritm(text, letter);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStartsWithLetterEmptyTextAndLetter() {
        String letter = "";
        String text = "";
        String expectedResult = "";

        StartsWithLetter as = new StartsWithLetter();
        String actualResult = as.testStartsWithLetterAlgoritm(text, letter);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
