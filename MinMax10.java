import java.util.Scanner;

public class MinMax10 {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        Scanner scanner  = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("insert number");
            int val = scanner.nextInt();
            if(val > max) max = val;
            if(val < min) min = val;
        }
        scanner.close();

        System.out.println("max is: " + max);
        System.out.println("min is: " + min);
    }
}
