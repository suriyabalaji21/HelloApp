/**
 * @author [SURIYA]
 * @version UC6: Display "Hello" with Multiple Command-Line Arguments using substring to Remove Trailing Delimiter
 */   
public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } 
        else {
            StringBuilder nameBuilder = new StringBuilder();

            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }
            String finalNames = nameBuilder.substring(0, nameBuilder.length() - 2);

            System.out.println("Hello, " + finalNames + "!");
        }
    }
}