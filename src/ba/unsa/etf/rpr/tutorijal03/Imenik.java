package ba.unsa.etf.rpr.tutorijal03;

import java.util.*;

public class Imenik {

    private HashMap<String, TelefonskiBroj> mapa=new HashMap<String, TelefonskiBroj>();

    public void dodaj(String ime, TelefonskiBroj broj){
        mapa.put(ime,broj);
    }

    public String dajBroj(String ime){
        return mapa.get(ime).ispisi();
    }

    public String dajIme(TelefonskiBroj broj){
        Set set=mapa.entrySet();
        Iterator iterator=set.iterator();
        while(iterator.hasNext()){
            Map.Entry mentry=(Map.Entry)iterator.next();
            if(mentry.getValue().equals(broj)){
                return (String) mentry.getKey();
            }
        }
        return "";
    }

    public String naSlovo(char s){
        int vrijednost=1;
        String ispis=new String();
        for(Map.Entry<String,TelefonskiBroj> map : mapa.entrySet()) {
            ispis += vrijednost + ". " + map.getKey() + " - " + map.getValue();
            System.out.println(ispis);
            vrijednost++;
        }
        return "";
    }

    Set<String> izGrada(FiksniBroj.Grad g){

    }

    Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad g){

    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    
}
