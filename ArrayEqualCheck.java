import.java.util.Arrays;
class ArrayEqualCheck.java{
    public static void main(Stirng[] arg){
        int[] v1 = new int{10,20,30,40,50};
        int[] v2 = new int{20,30,40,60,100};

        int[][] m1 = new int {{10,20,30}{50,50,60}};
        int[][] m2 = new int {{20,40,60}{100,200,300}};

        System.out.println(v1.equals());
        System.out.println(Arrays.deepEquals(m2,m2));
    }
}