import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern patern = Pattern.compile("[A-Z]{2,6}");
        Matcher matcher = patern.matcher(input);
        if (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

