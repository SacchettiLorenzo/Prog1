public class MetodiRicorsivi{
    static int sommatoriaRicorsiva(){
        int sommatoria = 0;
        int num = SIn.readInt();
        if(num != 0){
            sommatoria = num + sommatoriaRicorsiva();
        }
        return sommatoria;
    }

    static boolean trovaCarattere(String dataset, int index, char letter){
        boolean lastvalue = false;
        if(dataset.charAt(index) == letter){
            lastvalue = true;
        }else{
            if(index < dataset.length()-1){
                lastvalue = trovaCarattere(dataset, index+1, letter);;
            }
        }
        return lastvalue;
    }

    static int contaCaratteri(String dataset, int index, char letter, int counter){
        if(index < dataset.length()-1){
            if(dataset.charAt(index) == letter){
                counter = contaCaratteri(dataset, index+1, letter, counter+1);
            }else{
                counter = contaCaratteri(dataset, index+1, letter, counter);
            }
        }else{
            return counter;
        }
        return counter;
    }

    static boolean testPalindromi(String dataset, int index){
        boolean lastvalue = false;
        if(dataset.length()-index != 0){
            if(dataset.charAt(index) == dataset.charAt(dataset.length()-1-index)){
                lastvalue =  testPalindromi(dataset, index+1);
            }else{
                lastvalue =  false;
            }
        }else{
            lastvalue = true;
        }
        
        return lastvalue;
    }
}

class TestRicorsione{
    public static void main(String[] args) {
        // l'utente deve inserire solamente il testo da analizzare e non gli indici quindi questi metodi devono
        //essere inseriti in un wrap come nel metodo "cazzo riportato sotto"
        //System.out.println(MetodiRicorsivi.sommatoriaRicorsiva());
        //System.out.println(MetodiRicorsivi.trovaCarattere("testodiprova", 0, 'g'));
        //System.out.println(MetodiRicorsivi.contaCaratteri("ramarromarrone", 0, 'r', 0));
        System.out.println(MetodiRicorsivi.testPalindromi("osso", 0));

    
    }

    void cazzo(String dataset, char letter){
        MetodiRicorsivi.trovaCarattere(dataset, 0, letter);
    }
}