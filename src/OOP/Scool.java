package OOP;

public class Scool {
    public static void main(String[] args){


        Teacher teacher1 = new Teacher(false, "Іван Петрович", "Іванків", 55, "Math");
        teacher1.printCard();
        teacher1.printTeacherCard();

//        Teacher teacher1 = new Teacher();
//        Teacher teacher2 = new Teacher("Марія Іванівна", "Петришин", 35);
//        Teacher teacher3 = new Teacher("Іван Петрович","Іванків", 55, "Math", true);
//        Teacher teacher4 = new Teacher(true);
//
//        Student student1 = new Student("Катруся", "Когут", 7, "2 клас",true);
//        Student student2 = new Student("Макс", "Левашов", 8, "3 клас",true);
//
//        System.out.println(teacher2.getFirstName());
//        teacher1.setIsTeacher(false);
//
//        teacher3.printCard(teacher3.getFirstName(),teacher3.getLastName(),teacher3.getAge(),teacher3.getSubject(), teacher3.getIsTeacher());
//        teacher2.setIsTeacher(true);
//        teacher2.setSubject("Ukraine Literature");
//        teacher2.printCard(teacher2.getFirstName(),teacher2.getLastName(),teacher2.getAge(),teacher2.getSubject(), teacher2.getIsTeacher());
//
//        student1.printCard(student1.getFirstName(),student1.getLastName(), student1.getAge(), student1.getGrade(), student1.isStudent());
//        student2.printCard(student2.getFirstName(),student2.getLastName(), student2.getAge(), student2.getGrade(), student2.isStudent());


    }
}
