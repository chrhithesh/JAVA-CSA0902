import java.util.Arrays;
import java.util.Scanner;

public class ReverseAlphabeticalSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = scanner.nextLine();
        char[] charArray = word.toCharArray();
        Arrays.sort(charArray);
        for (int i = 0; i < charArray.length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[charArray.length - 1 - i];
            charArray[charArray.length - 1 - i] = temp;
        }
        String reversedWord = new String(charArray);
        System.out.println("Word arranged in reverse alphabetical order: " + reversedWord);
        scanner.close();
    }
}
