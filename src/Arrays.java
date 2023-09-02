import java.math.BigInteger;
public class Arrays {
    public static void main(String[] args) {
        int[] tab = {1,2,3,10,9};

      //  for (int t : tab) {
     //       System.out.print(t+" ");
     //   }

        for (int i = tab.length-1; i >= 0; i--) {
            System.out.print(tab[i]+ " ");

        }

      //  BigInteger a = new BigInteger("1000000000000000000000000000000000000000000000000000000000000000000000");
      //  BigInteger b = new BigInteger("200");
      //  BigInteger sum = a.add(b);
       // System.out.println(sum);

    }
}
