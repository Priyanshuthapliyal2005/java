import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ques26 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java FileStats <file-path>");
            System.exit(1);
        }

        String filePath = args[0];
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            System.exit(1);
        }
        System.out.println("Character count: " + charCount);
        System.out.println("Word count: " + wordCount);
        System.out.println("Line count: " + lineCount);
        System.out.println(" *************************************************************************");
        System.out.println("Implemented By: Priyanshu Thapliyal\t Class Roll No. 46\t CSE4(A2)");
        System.out.println(" *************************************************************************");
    }
}
