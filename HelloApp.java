/**
 * @author [SURIYA]
 * @version UC5: Display "Hello" with Multiple Command-Line Arguments using Enhanced For Loop or Default Message
 */   
public class HelloApp {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder names = new StringBuilder();

            for (String name : args) {
                if (names.length() > 0) {
                    names.append(", ");
                }
                names.append(name);
            }
            System.out.println("Hello, " + names.toString() + "!");
        }
    }
}