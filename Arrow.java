import java.util.Scanner;

public class Arrow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int nPunti = 0;
        for (int i = 0; i < 2*length-1; i++) {
            if(i == 0 || i == (2*length-1)){
                nPunti = 0;
            }
            stampaRiga(nPunti,2);
            if(i >= length-1)nPunti--;
            else nPunti++;
        }
        scanner.close();
    }

    public static void stampaRiga(int nPunti, int nAsterischi){
        for (int i = 0; i < nPunti; i++) {
            System.out.print(".");
        }
        for (int i = 0; i < nAsterischi; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
