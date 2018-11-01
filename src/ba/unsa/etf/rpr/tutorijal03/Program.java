package ba.unsa.etf.rpr.tutorijal03;
import java.util.Scanner;

import static ba.unsa.etf.rpr.tutorijal03.FiksniBroj.Grad;
import static ba.unsa.etf.rpr.tutorijal03.FiksniBroj.Grad.*;

public class Program {

    public static void main(String[] args) {
        Imenik i=new Imenik();
        System.out.println("Unesite:\n 1-za dodavanje osobe,\n 2-pretrazivanje broja,\n 3-pretrazivanje osobe,\n 4-pretrazivanje osoba cije ime pocinje unesenim slovom,\n 5-spisak osoba iz datog grada,\n 6-spisak brojeva osoba iz datog grada");
        Scanner ulaz = new Scanner(System.in);
        int n=ulaz.nextInt();
        ulaz.nextLine();
        switch (n){
            case 1:
                System.out.println("Unesite ime:");
                String ime=ulaz.nextLine();
                System.out.println("Unesite telefonski broj(formata:xxx/xxx-xxx");
                String broj=ulaz.nextLine();
                if(broj.startsWith("06")){
                    MobilniBroj mb =new MobilniBroj(Integer.valueOf(broj.substring(0,3)),broj.substring(4,11));
                    i.dodaj(ime,mb);
                }
                else if(broj.startsWith("+")){
                    MedunarodniBroj mb=new MedunarodniBroj(broj.substring(0,6),broj.substring(7,14));
                    i.dodaj(ime,mb);
                }
                else{
                    for(Grad g:Grad.values()){
                        if(g.getPozivni().equals(broj.substring(0,3))){
                            FiksniBroj fb=new FiksniBroj(g,broj.substring(4,11));
                            i.dodaj(ime,fb);
                            break;
                        }
                    }
                }
                break;
            case 2:
        }
    }
}
