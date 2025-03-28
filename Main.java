public class Main {
    public static void main(String[] args) {
        StudentRepository repository = new StudentRepository();
        StudentService service = new StudentService(repository);

        service.registerStudent("Dimas", "S001");
        service.registerStudent("Dean", "S002");

        System.out.println("Daftar Mahasiswa:");
        for (Student student : service.getAllStudents()) {
            System.out.println(student.getName() + " - " + student.getId());
        }
    }
}