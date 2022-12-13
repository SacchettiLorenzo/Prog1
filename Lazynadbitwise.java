class Lazyandbitwise{
    public static void main(String[] args) {
        int a = 0;
        int b = 100;

        //NOTE - LAZY
        System.out.println((a!=0) && (b/a > 100)); // il secondo statement viene considerato sono se il primo è true o non da errore
        System.out.println((a!=0) || (b/a > 100)); // il secondo statement viene considerato solo se il primo non da errore 
        
        //NOTE - BITWISE
        System.out.println((a!=0) & (b/a > 100)); // vengono considerati entrambi gli statement (rispetta la tavola di verità &). se ci sono varaibili intere e non booleane esegue l'operazione & tra bit
        System.out.println((a!=0) | (b/a > 100)); // vengono considerati entrambi gli statement (rispetta la tavola di verità |). se ci sono varaibili intere e non booleane esegue l'operazione | tra bit
        
        System.out.println(~b); // esegue il not sui bit
        System.out.println((b<<2)); // esegue lo shift dei bit a sinistra di 2 posizioni
    }
}