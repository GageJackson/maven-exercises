import java.lang.Object;
import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class StringModifier {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter something: ");
        String userInput = scanner.nextLine();
        System.out.printf("You entered: %s%n", userInput);

        if(StringUtils.isNumeric(userInput)){
            System.out.printf("%s is a number%n", userInput);
        } else {
            System.out.printf("%s is not a number%n", userInput);
        }

        System.out.println(StringUtils.swapCase(userInput));
        System.out.println(StringUtils.reverse(userInput));
    }
}
