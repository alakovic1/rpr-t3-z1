package ba.unsa.etf.rpr.tutorijal03;

public class MedunarodniBroj extends TelefonskiBroj {

    private String mDrzava;
    private String mBroj;

    public MedunarodniBroj(String drzava,String broj){
        mDrzava=drzava;
        mBroj=broj;
    }

    @Override
    public String ispisi(){
        String ispis=new String();
        ispis+=mDrzava+mBroj;
        return ispis;
    }

    @Override
    public int hashCode() {
        return mDrzava.hashCode()+mBroj.hashCode();
    }



}
