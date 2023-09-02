import java.util.Scanner;

public class Pizzeria {

    public static void main(String[] args) {

        Pizze[] values = Pizze.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);

        }
        System.out.println("Podaj pizzę, którą chciałbys zamówić: ");
        Scanner scanner = new Scanner(System.in);

      Pizze pizze =   Pizze.valueOf(scanner.nextLine().toUpperCase());
        System.out.println("Zamówiłeś pizzę : "+ pizze.name());


    }

}
