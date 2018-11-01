package ba.unsa.etf.rpr.tutorijal03;

public class MedunarodniBroj extends TelefonskiBroj{
    private String drzava,broj;
    public MedunarodniBroj(String drzava, String broj){
        this.drzava=drzava;
        this.broj=broj;
    }
    @Override
    public int compareTo(TelefonskiBroj tb){
        return this.ispisi().compareTo(tb.ispisi());
    }
    @Override
    public String ispisi(){
        return drzava+broj;
    }
    /*@Override
    public int hashCode(){

    }*/
}
