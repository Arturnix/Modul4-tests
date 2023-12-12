import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

public class Mod3Zad4Test {

    @Test
    public void areArraysEqual() {

        Mod3Zad4 testObject = new Mod3Zad4();
        List<Mod3Zad4> testObject2 = testObject.getStudentsAfterSort();

        Collections.sort(testObject2);

        Assertions.assertArrayEquals(testObject.getStudents().toArray(), testObject2.toArray());
    }
}
