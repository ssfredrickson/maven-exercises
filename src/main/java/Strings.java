import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class Strings {
    public static void main(java.lang.String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence:");
        String userInput = scanner.nextLine();


        System.out.println("You entered: " + userInput);
        System.out.println("Does your sentence contain a Number? " + StringUtils.isNumeric(userInput));
        System.out.println("Flipped Cases: " + StringUtils.swapCase(userInput));
        System.out.println("Reversed: " + StringUtils.reverse(userInput));

    }
}
