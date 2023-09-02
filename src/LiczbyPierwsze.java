public class LiczbyPierwsze {


    public boolean czyPierwszaLiczba(int n) {
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(n);
                return false;
            } else return true;

        }
        return true;
    }

    public void calcBin(int n) {
        for (int i = n; i <= 0; i--) {
            if (n % 2 == 0) {
                System.out.println("1");

            } else System.out.println("0");



        }

    }
}

