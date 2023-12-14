import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Zadanie2Test {

    Zadanie2 passwordTest = new Zadanie2();

    @Test
    public void hasGoodLength() {
        Assertions.assertTrue(passwordTest.hasGoodLength("aaaafff"));
    }

    @Test
    public void hasNoWhiteSpaces() {
        Assertions.assertTrue(passwordTest.hasNoWhiteSpaces("sdfsfhg"));
    }

    @Test
    public void hasNoRepetitions() {
        Assertions.assertTrue(passwordTest.hasNoRepetitions("bnbm"));
    }

    @Test
    public void hasNumbers() {
        Assertions.assertTrue(passwordTest.hasNumbers("vbbb"));
    }

    @Test
    public void hasSpecialCharacter() {
        Assertions.assertTrue(passwordTest.hasSpecialCharacter("fghdsdf"));
    }
}
