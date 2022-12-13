public class Esame {
    public static void main(String[] args) {
        
        
        int[] vet = creaVet();
        System.out.println("Co-variante:");
        wrapCo(vet);
        System.out.println("Contro variante:");
        wrapContro(vet);
        System.out.println("dicotomica: ");
        wrapDic(vet);
        System.out.println("ricerca dicotomica:");
        wrapPari(vet);

        
        
        

    }
    //NOTE -metodo che conta i caratteri di un intero passatogli in input
    public static int contaCar(int a){
        int nCar = 0;
        while (a > 1){
            nCar++;   
            a = a/10;
        }
        return nCar;
    }  
    //NOTE -metodo per la creazione di una matrice chiedendo l'assegnamento dei valori all'utente
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
    //NOTE -metodo per la creazione di un vettore chiedendo l'assegnamento dei valori all'utente
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
    //NOTE -metodo che stampa una matrice presa in input calcolando anche il numero corretto di spazi tra i valori(da sistemare)
    public static void stampaMat(int[][] a) {
        int spaziMax = 5;
        for (int i = 0; i < a.length; i++){
            int[] vet = a[i];
            for (int j = 0; j < vet.length; j++){
            System.out.print(a[i][j]);
            int valore = a[i][j];
            int nSpazi = spaziMax - contaCar(valore);
                for(int y = 1; y <= nSpazi; y++){
                System.out.print(" ");
                }
            }
            System.out.println();  
        }
        int[] vet1 = a[0]; 
        if(a.length == vet1.length){
            System.out.println("La matrice e' una " + a.length + " x " + vet1.length);
        }
        else{
            System.out.println("La matrice non e' quadrata.");
        }
    }
    //NOTE -metodo che verifica se la matrice in esame è quadrata
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
    //NOTE -metodo per il calcolo del prodotto matriciale (da sistemare)
    public static int[][] prodottoMat(int[][] a, int[][] b){
        int[][] mat = new int[a.length][b[0].length];
        if (a.length!= b[0].length){
            System.out.println("La lunghezza delle colonne della prima matrice deve equivalere alla lunghezza delle righe della seconda.");
        }
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length; j++){
                mat[i][j] = 0;
                for (int k = 0; k < b[0].length; k++){
                    mat[i][j] = mat[i][j] + (a[j][k] * b[k][j]);
                }
            } 
        }
        return mat;
    }
    //NOTE -metodo che verifica se gli elementi di una matrice siano pari
    //TODO - metodo che chiede all'utente quale operazione sulle matrici in esame vuole eseguire
    /*public static int[][] operaMat(int[][] a, int[][] b){
        System.out.println("Selezionare l'operazione su matrici che si vuole eseguire, ecco le opzioni:");
        System.out.println("Per scegliere digitare la lettera corrispondente all'operazione: ");
        System.out.println("Prodotto matriciale:  1");
        System.out.println("Somma matriciale:  2");
        System.out.println("Prodotto numero matrice:  3");
        System.out.println("Prodotto vettore matriciale:  4");
    }*/
    //NOTE - metodo ricorsivo contro variante sui vettori
    public static void wrapContro(int[] a){
        stampaControVar(a, 0);
    }
    private static void stampaControVar(int[] a, int i){
        if (i < a.length){
            System.out.print(a[i] + " ");
            stampaControVar(a, ++i);
        }
        else {
            System.out.println();
        }
    }
    //NOTE - metodo ricorsivo co-variante sui vettori
    public static void wrapCo(int[] a){
        int i = a.length - 1;
        stampaCoVar(a, i);
    }
    private static void stampaCoVar(int[] a, int i){
        if (i >= 0){
            System.out.print(a[a.length - 1 - i] + " ");
            stampaCoVar(a, i - 1);
        }
        else 
            System.out.println();
    }
    //NOTE - metodo ricorsivo dicotomico sui vettori
    public static void wrapDic(int[] a){
        stampaDic(a, a.length - 1, 0);
        System.out.println();
    }
    private static void stampaDic(int[] a, int dx, int sx){
        int med = (dx + sx)/2;
        if (dx != sx){
            stampaDic(a, dx, med+1);
            stampaDic(a, med, sx);
        }
        else {
            System.out.print(a[a.length- 1- sx] + " ");
        }
    }
    //NOTE - metodo di ricerca dicotomica che stampa true se e' presente almeno un elemento pari nel vettore
    public static boolean wrapPari(int[] a){
        return pariDic(a, a.length -1, 0);
    }
    private static boolean pariDic(int[] a, int sx, int dx){
        boolean result = false;
        int m = (sx + dx)/2;
        if (sx != dx){
            boolean p1,p2;
            p1 = pariDic(a, sx, m);
            p2 = pariDic(a, m+1, dx);

        }
        else{
            if(a[sx] % 2 == 0)
                result = true;
        }
        return result;
    }


    
}
