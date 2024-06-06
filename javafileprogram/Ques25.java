import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ques25{
    public static void main(String[] args) {
        String line;
        String longestWord = "";
        int maxLength = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("textfile.txt"))) {
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.length() > maxLength) {
                        longestWord = word;
                        maxLength = word.length();
                    }
                }
            }
            System.out.println("Longest word: " + longestWord + " with length: " + maxLength);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(" *************************************************************************");
        System.out.println("Implemented By: Priyanshu Thapliyal\t Class Roll No. 46\t CSE4(A2)");
        System.out.println(" *************************************************************************");
    }
}

