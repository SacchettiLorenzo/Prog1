import java.util.Scanner;

public class Quadrato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if(j==i){
                    System.out.print("\\");
                }
                if(j > i)
                System.out.print(":");
                if(j<i)
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
