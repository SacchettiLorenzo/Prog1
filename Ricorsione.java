public class Ricorsione {
    public static void main(String args[]){
        
        System.out.println(recur(9));
    }

    public static boolean recur(int n){
        if(n==0)return true;
        else return !recur(n-1);
        //inverte la variabile di ritorno a ogni chiamata quindi se n è dispari sarà falsa 
        //in quanto il return true è true a n pari
    }
}



// dati in ingresso: n intero positivo
// dati in uscita: m boolean
// Condizioni di ingresso:
// condizioni di uscita: m=TRUE se n è pari altrimenti m=FALSE
// si può utilizzare sono l'operatore !
