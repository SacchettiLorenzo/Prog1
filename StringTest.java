import java.util.Scanner;

public class StringTest {
    public static void main(String[] args){
        // == vs equals
        String w1 = "testodiprova";
        String w2 = "testodiprova";
        Scanner scanner = new Scanner(System.in);

        String w3 = null;
        w3 = scanner.nextLine(); // insert "testodiprova"

        scanner.close();
        System.out.println(w1.equals(w2)); // check the semantic content of the string (if the single char are the same)
        System.out.println(w1 == w2); // w2 is initialized so it get pushed in the stack and the == operator check the semantic content. (stack on stack operation)

        System.out.println(w1.equals(w3)); // check the semantic content of the string (if the single char are the same)
        System.out.println(w1 == w3); // w3 value is set at runtime so it remain in the heap. Now the == operator check the addres. (stack on heap operation)
    }
}
