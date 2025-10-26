import java.util.Scanner;
import java.util.StringTokenizer;

public class Q_05 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a sentence:");
            String sentence = scanner.nextLine();
            StringTokenizer tokenizer = new StringTokenizer(sentence);
            StringBuilder cleanString = new StringBuilder();

            while (tokenizer.hasMoreTokens()) {
                String word = tokenizer.nextToken();
                word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
                cleanString.append(word);
            }
            String reversed = cleanString.reverse().toString();
            String original = cleanString.reverse().toString();

            if (original.equals(reversed)) {
                System.out.println("The sentence is a palindrome.");
            } else {
                System.out.println("The sentence is not a palindrome.");
            }

        }
}
