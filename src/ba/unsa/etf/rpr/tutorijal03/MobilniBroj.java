package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj{
    private int mobilnaMreza;
    private String broj;
    public MobilniBroj(int mobilnaMreza, String broj){
        this.mobilnaMreza=mobilnaMreza;
        this.broj=broj;
    }
    @Override
    public int compareTo(TelefonskiBroj tb){
        return this.ispisi().compareTo(tb.ispisi());
    }
    @Override
    public String ispisi(){
        String num=new String();
        switch(mobilnaMreza){
            case 60: num = "060/"+broj;
            break;
            case 61: num = "061/"+broj;
            break;
            case 62: num = "062/"+broj;
            break;
            case 63: num = "063/"+broj;
            break;
            case 64: num = "064/"+broj;
            break;
            case 65: num = "065/"+broj;
            break;
            case 66: num = "066/"+broj;
            break;
            case 67: num = "067/"+broj;
            break;
        }
        return num;
    }
    /*@Override
    public int hashCode(){

    }*/
};

