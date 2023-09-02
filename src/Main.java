import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Student student1 = new Student("Jan Kowalski", 25);
        Student student2 = new Student("Jan Kowalski", 25);

        System.out.println("student1 == student2");
        System.out.println(student1 == student2);
        System.out.println("student1.equals(student2)");
      boolean studenEquals =   student1.equals(student2);
        System.out.println(studenEquals);



    }
}