public class StringTest {
    public static void main(String[] args) {

        long time1, time2;
        long startTime = System.nanoTime();
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < 100000 ; i++) {
            string.append(i);
            string.append(" ");
        }
       String numbers1 = string.toString();
        time1 = System.nanoTime() - startTime;
        System.out.println("Time1: "+ time1);
        System.out.println(numbers1);


        startTime = System.nanoTime();

       String numbers2 = "";
        for (int i = 0; i < 100000 ; i++) {
            numbers2 = numbers2 + i+ " ";

        }

        time2 = System.nanoTime() - startTime;
        System.out.println("Time2: "+ time2);
        System.out.println(numbers2);
        System.out.println("Time2/Time1 = "+ time2/time1);


            };



        };


