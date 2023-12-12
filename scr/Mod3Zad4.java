import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Mod3Zad4 implements Comparable<Mod3Zad4>{
    private  int age;
    private  double height;
    private  String name;
    private  String lastName;

    private final List<Mod3Zad4> students = new ArrayList<>();
    private final List<Mod3Zad4> studentsAfterSort = new ArrayList<>();

    public Mod3Zad4(int age, double height, String name, String lastName) {
        this.age = age;
        this.height = height;
        this.name = name;
        this.lastName = lastName;
    }

    public Mod3Zad4() {
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

        studentsAfterSort.add(student1);
        studentsAfterSort.add(student2);
        studentsAfterSort.add(student3);
        studentsAfterSort.add(student4);
        studentsAfterSort.add(student5);
    }

    public List<Mod3Zad4> getStudents() {
        return students;
    }

    public List<Mod3Zad4> getStudentsAfterSort() {
        return studentsAfterSort;
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int compareTo(Mod3Zad4 otherStudent)
    {
        if (this.lastName.compareTo(otherStudent.getLastName()) != 0) {
            return this.lastName.compareTo(otherStudent.getLastName());
        }
        else {
            return  Integer.compare(getAge(), otherStudent.getAge());
        }
    }
}
