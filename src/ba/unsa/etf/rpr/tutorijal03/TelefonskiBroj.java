package ba.unsa.etf.rpr.tutorijal03;

public abstract class TelefonskiBroj implements Comparable<TelefonskiBroj>{
    public abstract String ispisi();
    //kada u baznoj klasi navodimo interfejse koje implementira ne moramo i u izvedenim
    @Override
    public abstract int compareTo(TelefonskiBroj tb);
    //public abstract int hashCode();
};
