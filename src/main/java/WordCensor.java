import java.util.Scanner;

public class WordCensor {
    public static void main(String[] args) {
        // TODO: Read a full sentence from the user using Scanner.nextLine()
        // TODO: Replace each banned word with exactly ***: dang, nuts, oops, yikes
        // TODO: Print the result prefixed with: Censored:
        // NOTE: Tests require exactly three asterisks (no ****) for every replacement

        Scanner input = new Scanner(System.in);
        System.out.print("Type a sentence: ");
        String sentence = input.nextLine();

        sentence = sentence.replace("dang", "***");
        sentence = sentence.replace("nuts", "***");
        sentence = sentence.replace("oops", "***");
        sentence = sentence.replace("yikes", "***");

        System.out.println("Censored: " + sentence);
    }
}
