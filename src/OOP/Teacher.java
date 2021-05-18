package OOP;

import static OOP.Utils.*;

public class Teacher extends Person{

    private String subject;

    public Teacher (boolean isStudent, String firstName, String lastName, int age, String subject) {
        super(isStudent, firstName, lastName,age);
        this.setSubject(subject);
    }

    public void setSubject(String subject){
        if (getPerson().equals("Teacher")) {
            this.subject = subject;
        }else {
            this.subject = null;
        }
    }

    public void printTeacherCard(){
        printCard();
        System.out.println(subject);
        printLine();
    }


//    Teacher() {
//    }
//
//    Teacher(boolean isTeacher) {
//        this.isTeacher = isTeacher;
//    }
//
//    Teacher(String firstName, String lastName, int age, String subject, boolean isTeacher) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.setAgeIsTeacher(age);
//        this.setIsTeacher(isTeacher);
//        this.setSubject(subject);
//    }
//
//    Teacher(String firstName, String lastName, int age) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.age = age;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setIsTeacher(boolean isTeacher) {
//        if(getIsTeacher() == false) {
//            this.isTeacher = false;
//        }else if (getIsTeacher()){
//            this.isTeacher = true;
//        }else {
//            this.isTeacher = isTeacher;
//        }
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getSubject() {
//        return subject;
//    }
//
//    public boolean getIsTeacher() {
//        return isTeacher;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public void setAgeIsTeacher(int age) {
//        if(age >= 21 && age < 65) {
//            this.age = age;
//            this.isTeacher = true;
//        } else {
//            System.out.println("Not eligible age.");
//            this.isTeacher = false;
//            this.subject = null;
//        }
//    }
//
//    public void setSubject(String subject) {
//        if (getIsTeacher() == false) {
//            this.subject = null;
//        }else if (
//                getIsTeacher()
//        ) {
//            this.subject = subject;
//        }else {
//            this.subject = subject;
//        }
//    }
//
//    public void printCard(String firstName,String lastName, int age,String subject, boolean isTeacher){
//        System.out.println("______________________________________________");
//        if (isTeacher) {
//            System.out.println("Teacher");
//        }
//        System.out.println(firstName + " " + lastName + ", " + age );
//        System.out.println(subject);
//
//        System.out.println("______________________________________________");
//    }
}
