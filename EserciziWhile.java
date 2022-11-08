import java.util.Scanner;

public class EserciziWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        scanner.close();
        System.out.println("for loop");
        for (int i = 0; i < number+1; i++) {
            System.out.println(i);
        }

        System.out.println("while loop");
        int counter = 0;
        while (counter < number+1) {
            System.out.println(counter);
            counter++;
        }

        System.out.println("odd numbers");
        for (int i = 0; i < number+1; i++) {
            if(i % 2 != 0)
            System.out.println(i);
        }

        System.out.println(" n! for loop");
        int factorial = 1;
        for (int i = 1; i < number+1; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);

        System.out.println("!n while loop");
        counter = 1;
        factorial = 1;
        while(counter < number+1){
            factorial = factorial*counter;
            counter++;
        }
        System.out.println(factorial);


        
    }
}
