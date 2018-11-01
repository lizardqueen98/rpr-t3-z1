package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj{
    private String broj;
    private Grad grad;
    //public enum Grad{SARAJEVO,TUZLA,ZENICA,BIHAC,ORASJE,GORAZDE,TRAVNIK,MOSTAR,SIROKI_BRIJEG,LIVNO,BRCKO};
    public FiksniBroj(Grad grad, String broj){
        this.grad=grad;
        this.broj=broj;
    }
    @Override
    public String ispisi(){
        String num=null;
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
        return num;
    }
    @Override
    public int hashCode(){

    }

};
