package practice;

public class Teacher {

    public static void main(String[] args) {

        String space = " ";
        String coma = ",";
        String line = "___________________________________________________________";

        String firstName1;
        String lastName1;
        int age1;
        String subject1;
        boolean isTeacher1 = true;
        boolean isStudent1 = false;

        String firstName2;
        String lastName2;
        int age2;
        String subject2;
        boolean isTeacher2 = true;
        boolean isStudent2 = false;


        firstName1 = "Марія Іванівна";
        lastName1 = "Петришин";
        age1 = 35;
        subject1 = "Ukraine Literature";

        firstName2 = "Іван Петрович";
        lastName2 = "Іванків";
        age2 = 55;
        subject2 = "Math";

        if (firstName1 == "Марія Іванівна" && age1 == 36 && subject1 == "Ukraine Literature") {
            System.out.println(firstName1 + space + lastName1 + coma + space + "age =" + space + age1 + coma + space + subject1);
        } else if (firstName2 == "Іван Петрович" && age2 == 55 && lastName2 == "Іванків")
        {
            System.out.println(firstName2 + space + lastName2 + coma + space + "age =" + space + age2 + coma + space + subject2);
        } else {
            System.out.println("Error");
        }

        System.out.println(line);
        System.out.println("Вихід з програми");

        System.out.println(firstName1 + space + lastName1 + coma + space + "age =" + space + age1 + coma + space + subject1);
        System.out.println(firstName2 + space + lastName2 + coma + space + "age =" + space + age2 + coma + space + subject2);

    }
}
