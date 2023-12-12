import java.util.Objects;

public class Mod3Zad4 implements Comparable<Mod3Zad4>{
    private final int age;
    private final double height;
    private final String name;
    private final String lastName;

    public Mod3Zad4(int age, double height, String name, String lastName) {
        this.age = age;
        this.height = height;
        this.name = name;
        this.lastName = lastName;
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
