import java.util.Arrays;
// check the content of the array, matrix
public class ArrayEqualCheck{
    public static void main(String[] arg){
        int[] v1 = {10,20,30,40,50};
        int[] v2 = {20,30,40,60,100};

        int[][] m1 = {{10,20,30},{50,50,60}};
        int[][] m2 = {{20,40,60},{100,200,300}};

        System.out.println(v1.equals(v2));
        System.out.println(Arrays.deepEquals(m1,m2));
    }
}