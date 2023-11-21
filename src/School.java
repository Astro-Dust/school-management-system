import java.util.List;

public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static float totalMoneyEarned;
    private static float totalMoneySpent;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        this.totalMoneyEarned = 0;
        this.totalMoneySpent = 0;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }
    // add a new teacher to school
    public void addTeacher(Teacher newTeacher) {
        teachers.add(newTeacher);
    }

    public List<Student> getStudents() {
        return students;
    }
    public void addStudent(Student newStudent) {
        students.add(newStudent);
    }

    public float getTotalMoneyEarned() {
        return totalMoneyEarned;
    }
    public static void updateTotalMoneyEarned(float moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    public static float getTotalMoneySpent() {
        return totalMoneySpent;
    }
    // update the money that is spent by the school, which is the salary given by the school to its teachers
    public static void updateTotalMoneySpent(float moneySpent) {
        totalMoneyEarned -= moneySpent;
    }

}
