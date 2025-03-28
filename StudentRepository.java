import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements Repository<Student> {
    private final List<Student> students = new ArrayList<>();

    @Override
    public void save(Student student) {
        students.add(student);
    }

    @Override
    public List<Student> findAll() {
        return List.copyOf(students);
    }
}