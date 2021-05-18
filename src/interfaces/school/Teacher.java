package interfaces.school;

import static interfaces.school.ISalary.*;

public class Teacher extends BasePerson implements ISalary {

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

    @Override
    public double getBaseSalary() {
        double baseSalary = set * BASE_HOURS_SET * HOURLY_WAGE_PER_TEACHER;
        return baseSalary;
    }

    @Override
    public double getSalaryPerMonth() {
        double salaryPerMonths = getBaseSalary() * 4 + FOR_TC_PER_WEEK * 4;
        return salaryPerMonths;
    }

    @Override
    public double getSalary() {
        return getSalaryPerMonth() - getTaxesPerMonths();
    }

    @Override
    public double getTaxesPerMonths() {
        System.out.println("Taxes: $");
        return getSalaryPerMonth() * 30 / 100;
    };

}
