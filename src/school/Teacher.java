package school;

import static school.Data.*;

public class Teacher extends BaseEmployee{

    private String subject;
    private int set;
    private double code;

    public Teacher(String firstName, String lastName, char gender, int age, String status, String subject, int sets, double code) {
        super(firstName, lastName, gender, age, status);
        this.subject = subject;
        this.set = sets;
        this.code = code;
    }

    public String getSubject() {
        return subject;
    }

    public void printTeacher() {
        System.out.println(
                "Teacher: " + getFirstName() + " " + getLastName() + ", subject: " + getSubject()
        );
    }

    public double getBaseSalary() {
        double baseSalary = set * BASE_HOURS_SET * HOURLY_WAGE_PER_TEACHER;
        return baseSalary;
    }

    public double getSalaryPerMonth() {
        double salaryPerMonths = getBaseSalary() * 4 + FOR_TC_PER_WEEK * 4;
        return salaryPerMonths;
    }

    @Override
    public double getSalary() {
        return getSalaryPerMonth() - getTaxes();
    }

    @Override
    public double getTaxes() {
        return getSalaryPerMonth() * 30 / 100;
    }
}
