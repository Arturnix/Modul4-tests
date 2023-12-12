import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mod3Zad4Test {

    @Test
    public void areArraysEqual() {
        List<Mod3Zad4> students = new ArrayList<>();
        Mod3Zad4 student1 = new Mod3Zad4(20, 185, "Ron", "Flex");
        Mod3Zad4 student2 = new Mod3Zad4(19, 180, "Jon", "Bet");
        Mod3Zad4 student3 = new Mod3Zad4(24, 179, "Alex", "Howl");
        Mod3Zad4 student4 = new Mod3Zad4(17, 182, "Franz", "Howl");
        Mod3Zad4 student5 = new Mod3Zad4(23, 178, "Henry", "Bet");

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        List<Mod3Zad4> studentsAfterSort = new ArrayList<>();

        studentsAfterSort.add(student1);
        studentsAfterSort.add(student2);
        studentsAfterSort.add(student3);
        studentsAfterSort.add(student4);
        studentsAfterSort.add(student5);

        Collections.sort(studentsAfterSort);

        //Assertions.assertEquals(students.get(0).getAge(), studentsAfterSort.get(0).getAge());
        Assertions.assertArrayEquals(students.toArray(), studentsAfterSort.toArray());
    }
}
