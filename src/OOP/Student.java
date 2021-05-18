package OOP;

import static OOP.Utils.printLine;

public class Student extends Person {

    private int grade;

    public Student(boolean isStudent, String firstName, String lastName, int age, int grade) {
        super(isStudent, firstName, lastName, age);
        this.setGrade(grade);
    }

    public void setGrade(int grade){
        if (getPerson().equals("Student")) {
            this.grade = grade;
        }else {
            this.grade = 0;
        }
    }

    public void printStudentCard(){
        printCard();
        System.out.println(grade);
        printLine();
    }




//    public Student(String firstName, String lastName, int age, String grade, boolean isStudent) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.age = age;
//        this.grade = grade;
//        this.isStudent = isStudent;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getGrade() {
//        return grade;
//    }
//
//    public void setGrade(String grade) {
//        this.grade = grade;
//    }
//
//    public boolean isStudent() {
//        return isStudent;
//    }
//
//    public void setStudent(boolean student) {
//        isStudent = student;
//    }
//
//    public void printCard(String firstName, String lastName, int age, String grade, boolean isStudent){
//        System.out.println("______________________________________________");
//        if (isStudent) {
//            System.out.println("Student");
//        }
//        System.out.println(firstName + " " + lastName + ", " + age );
//        System.out.println(grade);
//
//        System.out.println("______________________________________________");
//    }

}
