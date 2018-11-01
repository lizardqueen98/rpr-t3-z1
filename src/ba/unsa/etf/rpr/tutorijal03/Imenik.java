package ba.unsa.etf.rpr.tutorijal03;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
//Static import is a feature introduced in the Java programming language that allows members (fields and methods) defined in a class as public static
// to be used in Java code without specifying the class in which the field is defined.
import static ba.unsa.etf.rpr.tutorijal03.FiksniBroj.Grad;
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
            //entrySet() vraca set: Set<Map.Entry<K,V>>; krecemo se kroz taj set rangovskom for petljom
            //preko seta mozemo mijenjati mapu
           for(HashMap.Entry<String,TelefonskiBroj> entry : mapa.entrySet()){
               ime = entry.getKey();
               TelefonskiBroj br=entry.getValue();
               if(broj==br) break;
           }
        }
        return ime;
    }
    public String naSlovo(char s){
        String lista=null;
        String ime;
        int brojac=1;
        for(HashMap.Entry<String,TelefonskiBroj> entry : mapa.entrySet()){
            ime = entry.getKey();
            if(ime.charAt(0)==s){
               lista+=brojac+". "+ime+entry.getValue()+"\n";
               brojac++;
            }
        }
        return lista;
    }/*
    public Set<String> izGrada(Grad g){
        Set<String> s=new Set<String>();
        for(HashMap.Entry<String,TelefonskiBroj> entry : mapa.entrySet()){
            if(entry.getValue() instanceof FiksniBroj){

            }
        }
    }
    public Set<TelefonskiBroj> izGradaBrojevi(Grad g){

    }
*/
}
