import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Teacher lizzy = new Teacher(1, "Lizzy", 1_500);
        Teacher hannah = new Teacher(2, "Hannah", 1_900);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(hannah);

        Student ana = new Student(1, "Ana", 4);
        Student rebecca = new Student(2, "Rebecca", 2);

        List<Student> studentList = new ArrayList<>();
        studentList.add(ana);
        studentList.add(rebecca);

        School coolSchool = new School(teacherList, studentList);

        ana.payFees(20_000);
        rebecca.payFees(40_000);
        System.out.println("Cool School has earned $ " + coolSchool.getTotalMoneyEarned());

        System.out.println("---- Making Cool School pay the teachers ----");
        lizzy.receiveSalary(lizzy.getSalary());
        hannah.receiveSalary(hannah.getSalary());
        System.out.printf("Cool School has paid Hannah's salary and now has $ %.2f", coolSchool.getTotalMoneyEarned());

    }
}
