import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Zadanie2Test {

    @Test
    public void hasGoodLength() {
        Assertions.assertTrue(Zadanie2.hasGoodLength("aaaabbbbbfff"));
    }

    @Test
    public void hasNoWhiteSpaces() {
        Assertions.assertTrue(Zadanie2.hasNoWhiteSpaces("sdfsfhg"));
    }

    @Test
    public void hasNoRepetitions() {
        Assertions.assertTrue(Zadanie2.hasNoRepetitions("bnbm"));
    }

    @Test
    public void hasNumbers() {
        Assertions.assertTrue(Zadanie2.hasNumbers("vbbb"));
    }

    @Test
    public void hasSpecialCharacter() {
        Assertions.assertTrue(Zadanie2.hasSpecialCharacter("asddd-"));
    }
}
