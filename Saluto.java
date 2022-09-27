import java.util.Scanner;
// una classe non pubblica può essere descritta in un file con nome diverso dal nome dela classe
public class Saluto{
    public static void main(String[] args){
        System.out.println("Ciao");
        System.out.println("Prova");
        
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        scanner.close();

        System.out.println(line);
    }
}