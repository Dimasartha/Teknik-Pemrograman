import java.util.List;

public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void registerStudent(String name, String id) {
        studentRepository.save(new Student(name, id));
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}