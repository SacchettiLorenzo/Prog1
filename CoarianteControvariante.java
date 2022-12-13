import java.util.Arrays;
public class CoarianteControvariante {
    public static void main(String[] args) {
        int[] dataset = { 10, 20, 30, 50, 60, 4, 3, 3, 576, 12, 678 };
        //stampaArrayRicCon(dataset);
        //stampaArrayRicCov(dataset);
        //stampaArrayRicDicotomic(dataset);
    }

    // NOTE - stampa controvariante
    // l'indice è inizializzato a 0;

    // NOTE - stampa covariante
    // l'indice è inizializzato alla lunghezza dell'array

    // NOTE - stampa dicotomica
    // ogni volta viene diviso in 2 il numero di elemanti considerati
    // ha 3 parametri formali (vettore, indici di sinistra, indici di destra)

    static void stampaArrayRicCon(int[] x) {
        stampaArrayRicCon(x, 0);
    }

    private static void stampaArrayRicCon(int[] x, int i) {
        if (i < x.length) {
            System.out.println(x[i] + " ");
            stampaArrayRicCon(x, i + 1);
        } else {
            System.out.println();
        }
    }

    // TODO: implementare gli altri metodi (covariante, dicotomico)

    static void stampaArrayRicCov(int[] x) {
        stampaArrayRicCov(x, x.length - 1);
    }

    private static void stampaArrayRicCov(int[] x, int i) {
        if (i >= 0) {
            System.out.println(x[x.length - 1 - i] + "");
            stampaArrayRicCov(x, i - 1);
        } else {
            System.out.println();
        }
    }

    static void stampaArrayRicDicotomic(int x[]) {
        stampaArrayRicDicotomic(x, 0, x.length - 1);
    }

    private static void stampaArrayRicDicotomic(int x[], int left, int right) {
        int mid = (left + right) / 2;

        if (left != right) {
            stampaArrayRicDicotomic(x, left, mid);
            stampaArrayRicDicotomic(x, mid + 1, right);
        } else {
            System.out.println(x[left]);
        }
    }

}


