import java.io.*;
import java.util.Scanner;

public class FileCreator {
    public static void main(String[] args)  {
        
        String fileName ="testFile.txt";

        try (
                var fileReader = new FileReader(fileName);
                var reader = new BufferedReader(fileReader);
                ) {

            String netxLine = null;
            int lines = 0;
            while ((netxLine = reader.readLine()) != null){
                System.out.println(netxLine);
                lines++;
            }
            System.out.println("Liczba wierszy w pliku: "+ lines);
        }  catch (IOException e) {
           e.printStackTrace();
        }
    }


}

