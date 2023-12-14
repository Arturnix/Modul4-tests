import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Mod3Zad4 implements Comparable<Mod3Zad4>{
    private  int age;
    private  double height;
    private  String name;
    private  String lastName;

    private List<Mod3Zad4> students = new ArrayList<>();
    private List<Mod3Zad4> studentsAfterSort = new ArrayList<>();

    public Mod3Zad4(int age, double height, String name, String lastName) {
        this.age = age;
        this.height = height;
        this.name = name;
        this.lastName = lastName;
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

    @Override
    public String toString() {
        return "Mod3Zad4{" +
                "age=" + age +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
