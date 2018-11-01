package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj{
    private String broj;
    private Grad grad;
    public enum Grad{SARAJEVO,TUZLA,ZENICA,BIHAC,ORASJE,GORAZDE,TRAVNIK,MOSTAR,SIROKI_BRIJEG,LIVNO,BRCKO};
    public FiksniBroj(Grad grad, String broj){
        this.grad=grad;
        this.broj=broj;
    }
    @Override
    public String ispisi(){
        switch(grad) {
            case SARAJEVO: return "033/"+broj;
            break;
            case TUZLA: return "035/"+broj;
            break;
            case ZENICA: return "032/"+broj;
            break;
            case BIHAC: return "037/"+broj;
            break;
            case ORASJE: return "031/"+broj;
            break;
            case GORAZDE: return "038/"+broj;
            break;
            case TRAVNIK: return "030/"+broj;
            break;
            case MOSTAR: return "036/"+broj;
            break;
            case SIROKI_BRIJEG: return "039/"+broj;
            break;
            case LIVNO: return "034/"+broj;
            break;
            case BRCKO: return "049/"+broj;
            break;
        }
    }
    @Override
    public int hashCode(){

    }

};
