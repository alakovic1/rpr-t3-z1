package ba.unsa.etf.rpr.tutorijal03;

import java.util.*;

public class Imenik {

    private HashMap<String, TelefonskiBroj> mapa;

    public void dodaj(String ime, TelefonskiBroj broj);
    public String dajBroj(String ime);
    public String dajIme(TelefonskiBroj broj);
    public String naSlovo(char s);
    Set<String> izGrada(FiksniBroj.Grad g);
    Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad g);

}
