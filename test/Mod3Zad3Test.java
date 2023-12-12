import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class Mod3Zad3Test {

    private Mod3Zad3 testObject = new Mod3Zad3();

    @Test
    public void checkMapContents() {

        HashMap<String, Integer> testMap = new HashMap<>();
        testMap.put("Ala", 2);
        testMap.put("ma", 2);
        testMap.put("kota", 2);

        String text = "Ala ma kota, kota ma Ala";

        Assertions.assertEquals(testMap, testObject.countWords(text));
    }
}
