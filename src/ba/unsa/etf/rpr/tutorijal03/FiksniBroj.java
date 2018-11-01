package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj{
    private String broj;
    private Grad grad;
    //Nested enum types are implicitly static. It is permissible to explicitly declare a nested enum type to be static.
    //This implies that it is impossible to define a local enum, or to define an enum in an inner class.
    public enum Grad{
        SARAJEVO("033"),TUZLA("035"),ZENICA("032"),BIHAC("037"),ORASJE("031"),GORAZDE("038"),TRAVNIK("030"),MOSTAR("036"),SIROKI_BRIJEG("039"),LIVNO("034"),BRCKO("049");
        private String pozivni;
        //konstruktor ne smije biti public
        Grad(String pozivni){
            this.pozivni=pozivni;
        }
        public String getPozivni(){return pozivni;}
    };
    public FiksniBroj(Grad grad, String broj){
        this.grad=grad;
        this.broj=broj;
    }
    @Override
    public String ispisi(){
        return grad.getPozivni()+broj;
        /*String num=null;
        switch(grad) {
            case SARAJEVO: num = "033/"+broj;
            break;
            case TUZLA: num = "035/"+broj;
            break;
            case ZENICA: num = "032/"+broj;
            break;
            case BIHAC: num = "037/"+broj;
            break;
            case ORASJE: num = "031/"+broj;
            break;
            case GORAZDE: num = "038/"+broj;
            break;
            case TRAVNIK: num = "030/"+broj;
            break;
            case MOSTAR: num = "036/"+broj;
            break;
            case SIROKI_BRIJEG: num = "039/"+broj;
            break;
            case LIVNO: num = "034/"+broj;
            break;
            case BRCKO: num = "049/"+broj;
            break;
        }
        return num;*/
    }
    /*@Override
    public int hashCode(){

    }*/

};
