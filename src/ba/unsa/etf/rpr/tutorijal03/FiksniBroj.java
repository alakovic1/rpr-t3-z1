package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj {

    enum Grad{TRAVNIK,ORASJE,ZENICA,SARAJEVO,LIVNO,TUZLA,MOSTAR,BIHAC,GORAZDE,SIROKIBRIJEG,BRCKO}

    private Grad nekiGrad;
    private String nekiBroj;

    private static String[] pozivni = { "030", "031", "032", "033", "034", "035", "036", "037", "038", "039", "049"};

    public FiksniBroj(Grad grad, String broj){
        nekiGrad=grad;
        nekiBroj=broj;
    }

    public String getPozivniGrada () {
        return pozivni[nekiGrad.ordinal()];
    }

    public String getPozivniTrazenogGrada (Grad g) {
        return pozivni[g.ordinal()];
    }

    @Override
    public String ispisi () {
        return pozivni[nekiGrad.ordinal()] + "/" + nekiBroj;
    }


    @Override
    public int hashCode(){
        return nekiBroj.hashCode();
    }
}
