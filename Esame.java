public class Esame {
    public static void main(String[] args) {
        //int[][] mat = creaMat();
        int[][] mat = creaMat();
        stampaMat(mat);
        //boolean x = e1(mat);
        //System.out.println(x);

    }

    public static int contaCar(int a){
        int nCar = 0;
        while (a > 1){
            nCar++;   
            a = a/10;
        }
        return nCar;
    }
    
    public static int[][] creaMat(){
        System.out.println("selezionare il numero di colonne della matrice: ");
        int col = SIn.readLineInt();
        int[][] mat = new int[col][];
        for (int i = 0; i < mat.length; i++){
            int[] a = creaVet();
           // if (a.length != mat.length){
               // System.out.println("La matrice può solo essere quadrata");
               // break;
           // }    
            mat[i] = a;
        }
        
        return mat;
    }
    public static int[] creaVet() {
        int n;
        System.out.print("Inserire il valore della lunghezza del vettore: ");
        int x = SIn.readLineInt();
        int[] vet = new int[x];
        System.out.println("inserire uno alla volta i valori del vettore: ");
        for (int i = 0; i < vet.length; i++) {
            n = SIn.readLineInt();
            vet[i] = n;
	    }
	    return vet;
    }
    public static boolean e1(int[][] a) {
        boolean result = true;
        if (a == null)
            result = false;
        else {
            for (int i = 0; i < a.length; i++){
                int[] r = a[i];
                if (r.length != a.length){
                    System.out.println("la matrice non è quadrata");
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
    
    public static void stampaMat(int[][] a) {
        int spaziMax = 5;
        for (int i = 0; i < a.length; i++){
            int[] vet = a[i];
            for (int j = 0; j < vet.length; j++){
            System.out.print(a[i][j]);
            int valore = a[i][j];
            int nSpazi = spaziMax - contaCar(valore);
                for(int y = 1; y < nSpazi; y++){
                System.out.print(" ");
                }
            }
            System.out.println();  
        }
    }
    
}
/*
creare un metodo che restituisca la lunghezza della matrice 
creare un metodo per il prodotto matriciale
creare metodo per le operazioni tra matrici
*/