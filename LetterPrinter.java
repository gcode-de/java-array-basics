import java.util.Scanner;

public class LetterPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Text:");
        String input = scanner.nextLine();

        System.out.println("Characters:");
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            System.out.println(letter);
        }

        scanner.close();
    }
}
