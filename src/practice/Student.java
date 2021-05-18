package practice;

public class Student {
    public static void main(String[] args) {

        String space = " ";
        String coma = ",";
        String line = "___________________________________________________________________";

        String firstName1 = "Катруся";
        String lastName1 = "Когут";
        int age1 = 7;
        String grade1 = "2 клас";
        boolean isTeacher1 = false;
        boolean isStudent1 = true;

        String firstName2 = "Макс";
        String lastName2 = "Левашов";
        int age2 = 8;
        String grade2 = "3 клас";
        boolean isTeacher2 = false;
        boolean isStudent2 = true;

        System.out.println(firstName1 + space + lastName1 + coma + space + "age =" + space + age1 + coma + space + grade1);
        System.out.println(firstName2 + space + lastName2 + coma + space + "age =" + space + age2 + coma + space + grade2);

    }
}
