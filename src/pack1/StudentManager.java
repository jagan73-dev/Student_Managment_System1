package pack1;
import java.util.*;
public class StudentManager {

    private ArrayList<Student> list = new ArrayList<>();
    private HashMap<Integer, Student> map = new HashMap<>();

    // Add Student
    public void addStudent(Student s) {
        list.add(s);
        map.put(s.getRollNo(), s);
    }

    // Remove Student
    public boolean removeStudent(int rollNo) {
        Student s = map.remove(rollNo);
        if (s != null) {
            list.remove(s);
            return true;
        }
        return false;
    }

    // Search Student
    public Student searchStudent(int rollNo) {
        return map.get(rollNo);
    }

    // Display All
    public void displayAll() {
        for (Student s : list) {
            System.out.println(s);
        }
    }

    // Sort by name
    public void sortByName() {
        list.sort(Comparator.comparing(Student::getName));
    }

    // Sort by marks
    public void sortByMarks() {
        list.sort(Comparator.comparing(Student::getMarks).reversed());
    }
}
