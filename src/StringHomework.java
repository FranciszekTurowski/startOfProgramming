import java.util.Scanner;

public class StringHomework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj ile wyrazów chcesz wczytać: ");

        int wordsNumber = input.nextInt();
        input.nextLine();


       String[] words = new String[wordsNumber];


        for (int i = 0; i < wordsNumber ; i++) {
            System.out.println("Podaj kolejne słowo");
            words[i] = input.nextLine();
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <wordsNumber ; i++) {
            builder.append(words[i].charAt(words[i].length()-1));
        }
        String s = builder.toString();
        System.out.println(s);

    }
}
