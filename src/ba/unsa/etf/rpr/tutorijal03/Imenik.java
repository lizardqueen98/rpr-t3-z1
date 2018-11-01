package ba.unsa.etf.rpr.tutorijal03;
import java.util.Set;
import java.util.HashMap;
public class Imenik {

    private HashMap<String,TelefonskiBroj> mapa = new HashMap<String,TelefonskiBroj>();

    public void dodaj(String ime, TelefonskiBroj broj){
    mapa.put(ime,broj);
    }
    public String dajBroj(String ime){
        return mapa.get(ime).ispisi();
    }
    public String dajIme(TelefonskiBroj broj){
        String ime=null;
        if(mapa.containsValue(broj)){
           for(HashMap.Entry<String,TelefonskiBroj> entry : mapa.entrySet()){
               ime = entry.getKey();
               TelefonskiBroj br=entry.getValue();
               if(broj==br) break;
           }
        }
        return ime;
    }
    public String naSlovo(char s){

    }
    public Set<String> izGrada(Grad g){

    }
    public Set<TelefonskiBroj> izGradaBrojevi(Grad g){

    }

}
