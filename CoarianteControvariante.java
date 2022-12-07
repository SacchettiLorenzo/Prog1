public class CoarianteControvariante {
    public static void main(String[] args) {
        int[] dataset = {10,20,30,50,60,4,3,3,576,12,678};
        stampaRicCon(dataset, 0);
    }

    // stampa controvariante
    // l'indice è inizializzato a 0;
    static void stampaRicCon(int[] x, int i){
        if(i<x.length){
            System.out.println(x[i] + " ");
            stampaRicCon(x, i+1);
        }else{
            System.out.println();
        }
    }

    //TODO: implementare gli altri metodi (covariante, dicotomico)
    // il metodo dicotomico ha 3 parametri formali (vettore, indici di sinistra, indici di destra)

    
}
