public class Student {
    private int id;
    private String name;
    private int grade;
    private float feesPaid;
    private float feesTotal; // the fees for every student is $ 30,000

    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 30_000;
    }

    // Not going to change student's id and name
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
    public void setGrade(char grade) {
        this.grade = grade;
    }

    public float getFeesPaid() {
        return this.feesPaid;
    }

    public float getFeesTotal() {
        return this.feesTotal;
    }

    // add the fees to the feesPaid. The school is going to receive the funds
    public void payFees(int fees) {
        if (this.feesPaid <= this.feesTotal) {
            feesPaid += fees;
            School.updateTotalMoneyEarned(feesPaid); // because this method is static, i can use it wherever i want!
        } else {
            System.out.println("All fees has been paid.");
        }
    }

    public float getRemainingFees() {
        return feesTotal - feesPaid;
    }

}
