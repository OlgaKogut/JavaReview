package school;

import static school.Data.FOR_TC_PER_WEEK;
import static school.tests.Assert.*;

public class School {

    private static final String LINE = "______________________________________________";
    private static final double EXPECTED_BASE_SALARY = 1440;
    private static final double EXPECTED_PAY_CHECK = 4172;

    public static void main (String[] args) {

        Student student1 = new Student("Katrin", "Kohut", 'F', 7, "Student", 2);
        Student student2 = new Student("Maks", "Lev", 'M', 7, "Student", 2);

        Parent parent1 = new Parent("Olga", "Kohut", 'F', 36, "Parent", 12345678911L, student1);
        Parent parent2 = new Parent("Andy", "Kohut", 'M', 36, "Parent", 12345678911L, student1);
        Parent parent3 = new Parent("Tania", "lev", 'F', 42, "Parent", 12345675555L, student2);

        Teacher teacher1 = new Teacher("Maria Ivanivna", "Ivankiv", 'F', 35, "Teacher", "Literature", 2, FOR_TC_PER_WEEK);

        Parent[] parents = new Parent [] {parent1, parent2};

//        parent1.printParent();
//        parent2.printParent();
//        parent3.printParent();
//
//        System.out.println(LINE);
//
//        student1.printParent(parents);
//        System.out.println(LINE);
//        teacher1.printTeacher();
        aAssert(EXPECTED_BASE_SALARY, teacher1.getBaseSalary());
        aAssert(EXPECTED_PAY_CHECK, teacher1.getSalary());
    }
}
