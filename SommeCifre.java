import java.util.Scanner;
import java.lang.Math;

public class SommeCifre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int res = 0;
        for (int i = 0; i < value; i++) {
            int tmpres = 0;
            for (int j = 0; j < value-i; j++) {
                tmpres += numeroNcifre(value-i,value-j-i-1);
                res += tmpres;
            }
            System.out.println(tmpres);
        }

        System.out.println("totale: " + res);
        
        scanner.close();

    }

    public static int numeroNcifre(int val, int pow){

        return (int) (val*(Math.pow(10,pow)));
    }
}

