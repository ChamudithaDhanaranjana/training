import java.util.List;
import java.util.Arrays;
import lombok.Data;

@Data
public class Student {
    private int id;
    private String name;
    private int age;
    private List<String> subjects;

    // Constructor (optional, you can add one if needed)

    // Getters and Setters

    public class Main {
        public void main(String[] args) {
            Student s = new Student();
            s.setId(1);
            s.setName("john");
            s.setAge(20);
            s.setSubjects(Arrays.asList("Maths", "English", "History"));

            // Print the student values using getters
            System.out.println("ID: " + s.getId());
            System.out.println("Name: " + s.getName());
            System.out.println("Age: " + s.getAge());
            System.out.println("Subjects: " + s.getSubjects());
        }
    }

}
