import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class ReadFileExample {
    public static void main(String[] args) {
        String filePath = "example.txt"; 
        try {
            File file = new File(filePath);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String firstLine = br.readLine(); // may throw IOException
            System.out.println("First line: " + firstLine);
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        } catch (IOException e) {
            System.out.println("Error: An I/O error occurred while reading the file!");
        }
    }
}
