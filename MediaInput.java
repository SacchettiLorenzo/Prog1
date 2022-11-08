import java.util.Scanner;

public class MediaInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean input = true;
        int avg = 0;
        int counter = 0;
        while(input == true){
            int num = SIn.readInt();
            if(num == 0){
                input = false;
                System.out.println("end");
            }
            else counter++; 
            avg += num;
            
        }

        avg = avg / counter;
        scanner.close();

        System.out.println("avg is: "+ avg);
    }
}

/* without the use of SIn class
public class MediaInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean input = true;
        int avg = 0;
        int counter = 0;
        while(input == true){
            int num = scanner.nextInt();
            if(num == 0){
                input = false;
                System.out.println("end");
            }
            else counter++; 
            avg += num;
        }
        avg = avg / counter;
        scanner.close();
        System.out.println("avg is: "+ avg);
    }
}
*/
