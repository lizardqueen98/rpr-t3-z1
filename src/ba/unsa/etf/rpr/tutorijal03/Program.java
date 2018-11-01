package ba.unsa.etf.rpr.tutorijal03;
import java.util.Scanner;

import static ba.unsa.etf.rpr.tutorijal03.FiksniBroj.Grad;
import static ba.unsa.etf.rpr.tutorijal03.FiksniBroj.Grad.*;

public class Program {

    public static void main(String[] args) {
        Imenik i=new Imenik();
        while(true) {
            System.out.println("Unesite:\n 1-za dodavanje osobe,\n 2-pretrazivanje broja,\n 3-pretrazivanje osobe,\n 4-pretrazivanje osoba cije ime pocinje unesenim slovom,\n 5-spisak osoba iz datog grada,\n 6-spisak brojeva osoba iz datog grada, \n 7-za izlaz");
            Scanner ulaz = new Scanner(System.in);
            int n = ulaz.nextInt();
            ulaz.nextLine();
            switch (n) {
                case 1:
                    System.out.println("Unesite ime:");
                    String ime = ulaz.nextLine();
                    System.out.println("Unesite telefonski broj(formata:xxx/xxx-xxx");
                    String broj = ulaz.nextLine();
                    if (broj.startsWith("06")) {
                        MobilniBroj mb = new MobilniBroj(Integer.valueOf(broj.substring(0, 3)), broj.substring(4, 11));
                        i.dodaj(ime, mb);
                    } else if (broj.startsWith("+")) {
                        MedunarodniBroj mb = new MedunarodniBroj(broj.substring(0, 6), broj.substring(7, 14));
                        i.dodaj(ime, mb);
                    } else {
                        for (Grad g : Grad.values()) {
                            if (g.getPozivni().equals(broj.substring(0, 3))) {
                                FiksniBroj fb = new FiksniBroj(g, broj.substring(4, 11));
                                i.dodaj(ime, fb);
                                break;
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("Unesite ime:");
                    String name = ulaz.nextLine();
                    System.out.println(i.dajBroj(name));
                    break;
                case 3:
                    System.out.println("Unesite telefonski broj(formata:xxx/xxx-xxx");
                    String br = ulaz.nextLine();
                    if (br.startsWith("06")) {
                        MobilniBroj mb = new MobilniBroj(Integer.valueOf(br.substring(0, 3)), br.substring(4, 11));
                        System.out.println(i.dajIme(mb));
                    } else if (br.startsWith("+")) {
                        MedunarodniBroj mb = new MedunarodniBroj(br.substring(0, 6), br.substring(7, 14));
                        System.out.println(i.dajIme(mb));
                    } else {
                        for (Grad g : Grad.values()) {
                            if (g.getPozivni().equals(br.substring(0, 3))) {
                                FiksniBroj fb = new FiksniBroj(g, br.substring(4, 11));
                                System.out.println(i.dajIme(fb));
                                break;
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("Unesite slovo:");
                    String c = ulaz.nextLine();
                    System.out.println(i.naSlovo(c.charAt(0)));
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.exit(0);
            }
        }
    }
}
