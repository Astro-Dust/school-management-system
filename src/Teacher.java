public class Teacher {
    private int id;
    private String name;
    private float salary;
    private float salaryEarned;

    public Teacher(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    public void updateSalary(float salary) {
        this.salary = salary;
        School.updateTotalMoneySpent(salary);
    }

    // removes from the total money earned by the school
    public void receiveSalary(float salary) {
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

}
