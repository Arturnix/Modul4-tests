import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Mod3Zad1Test {

    private Mod3Zad1 testObject = new Mod3Zad1();

    @Test
    public void sumElementsReturns9() {

        int[] numbers = {1,3,5};
        Assertions.assertEquals(9, testObject.sumArray(numbers));
    }
}
