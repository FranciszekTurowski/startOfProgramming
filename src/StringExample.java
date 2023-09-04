public class StringExample {
    public static void main(String[] args) {


        long start = System.nanoTime();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 1000 ; i++) {
            builder.append(i);
            builder.append(" ");
        }
        String numbers = builder.toString();
        System.out.println(numbers);

        long time1 = System.nanoTime() - start;
        start = System.nanoTime();
        long time2 = System.nanoTime() - start;

        for (int i = 0; i < 1000 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println("Time1: "+ time1);
        System.out.println("Time2: "+ time2);
        System.out.println("Czas time2/time1 =" +time2/time1);

    }
}
