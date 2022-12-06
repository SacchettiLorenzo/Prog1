public class MetodiRicorsiviSuArray {
    public static void main(String[] args) {
        final int[] a0 = { 0, 1, 2, 3, 4, 5, 6, 7 };
        final int[] a1 = { 3, 7, 9, 4, 5, 12, 11 };
        final int[] a2 = null;
        final int[] a3 = { 0, 10, 40, 60, 20 };
        System.out.println(sommaDispari(a0));
        System.out.println(sommaDispari(a1));
        System.out.println(sommaDispari(a2));
        System.out.println(sommaDispari(a3));

        final int[] altezze = { 5895, 4810, 6194, 4897, 4884, 8848, 6962 };
        System.out.println(indiceMassimo(altezze));
    }

    public static int sommaDispari(int[] a) {
        if (a == null)
            return 0;

        int result = 0;

        if (a.length == 1) {
            if (a[0] % 2 == 1) {
                result = a[0];
            } else {
                result = 0;
            }
        } else {
            int[] left = new int[a.length / 2];
            int[] right = new int[a.length - left.length];

            for (int i = 0; i < left.length; i++) {
                left[i] = a[i];
            }

            for (int i = 0; i < right.length; i++) {
                right[i] = a[i + left.length];
            }

            result += sommaDispari(left);
            result += sommaDispari(right);
        }

        return result;
    }

    public static int indiceMassimo(int[] a) {
        int result = 0;

        if (a.length > 1) {

            int[] left = new int[a.length / 2];
            int[] right = new int[a.length - left.length];

            for (int i = 0; i < left.length; i++) {
                left[i] = a[i];
            }

            for (int i = 0; i < right.length; i++) {
                right[i] = a[i + left.length];
            }

            if(a.length >= 2){
                if(indiceMassimo(left) > indiceMassimo(right)) result = indiceMassimo(left);
                else result = indiceMassimo(right);
            }
        }else{
            return a[0];
        }

        return result;
    }

}
