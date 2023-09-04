public class Strrr {
    public static void main(String[] args) {
        String words = "Ziomki z Ferajny";
        String sub1 = words.toUpperCase();
        String sub2 = words.substring(2,10);
        String sub3 = words.trim();
        char sub4 = words.charAt(3);
        String sub5 = words.replaceAll("Ferajny","XDdddddddddd");
        System.out.println(sub1);
        System.out.println(sub2);
        System.out.println(sub3);
        System.out.println(sub4);
        System.out.println(sub5);



    }
}
