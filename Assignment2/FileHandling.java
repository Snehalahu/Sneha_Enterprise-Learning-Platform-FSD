import java.io.File;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {

        try {
            // Create a file
            File file = new File("example.txt");

            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }

            // Display file information
            System.out.println("File name: " + file.getName());
            System.out.println("File path: " + file.getAbsolutePath());

        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
