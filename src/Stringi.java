import java.util.Scanner;

public class Stringi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę wyrazów: ");
        int s = sc.nextInt();
        sc.nextLine();

      String[] words = new String[s];
        for (int i = 0; i < words.length; i++) {
            System.out.println("Podaj kolejne wyrazy");
            words[i] = sc.nextLine();
        }

        StringBuilder build = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            int index = words[i].length()-1;
            build.append(words[i].charAt(index));
        }

        System.out.println("Nowe słowo: " +build.toString());

    }
}
