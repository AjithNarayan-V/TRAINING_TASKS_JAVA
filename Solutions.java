import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    // Function to extract valid content from a line
    public static void extractValidContent(String line) {
        // Regular expression pattern to match valid tags and their content
        Pattern pattern = Pattern.compile("<([^<>]+)>([^<>]+)</\\1>");
        Matcher matcher = pattern.matcher(line);
        boolean found = false;
        while (matcher.find()) {
            found = true;
            System.out.println(matcher.group(2));
        }
        if (!found) {
            System.out.println("None");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Number of lines
        scanner.nextLine(); // Consume newline
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine().trim(); // Input line
            extractValidContent(line);
        }
        scanner.close();
    }
}
