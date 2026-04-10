/**
 * @author [SURIYA]
 * @version UC7: Display "Hello" with Multiple Command-Line Arguments using String
 */   
public class HelloApp {
    public static void main(String[] args) {
        // 1. Check if arguments exist
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // 2. String.join handles the loop, the building, and the delimiters
            String joinedNames = String.join(", ", args);

            // 3. Print the result
            System.out.println("Hello, " + joinedNames + "!");
        }
    }
}