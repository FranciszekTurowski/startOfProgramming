import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        String fileName = "testFile.txt";
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileName,true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.write("Bolek");
            writer.newLine();
            writer.write("Lolek");
            writer.newLine();
            writer.write("Karolek");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
