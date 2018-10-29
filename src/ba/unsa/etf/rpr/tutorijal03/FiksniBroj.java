package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj {
    enum Grad{TRAVNIK,ORASJE,ZENICA,SARAJEVO,LIVNO,TUZLA,MOSTAR,BIHAC,GORAZDE,SIROKIBRIJEG,BRCKO}
    private Grad nekiGrad;
    private String nekiBroj;

    public FiksniBroj(Grad grad, String broj){
        nekiGrad=grad;
        nekiBroj=broj;
    }

    @Override
    public String ispisi(){
        String ispis=new String();
        ispis+="0";
        if(nekiGrad==Grad.TRAVNIK) ispis+="30";
        else if(nekiGrad==Grad.ORASJE) ispis+="31";
        else if(nekiGrad==Grad.ZENICA) ispis+="32";
        else if(nekiGrad==Grad.SARAJEVO) ispis+="33";
        else if(nekiGrad==Grad.LIVNO) ispis+="34";
        else if(nekiGrad==Grad.TUZLA) ispis+="35";
        else if(nekiGrad==Grad.MOSTAR) ispis+="36";
        else if(nekiGrad==Grad.BIHAC) ispis+="37";
        else if(nekiGrad==Grad.GORAZDE) ispis+="38";
        else if(nekiGrad==Grad.SIROKIBRIJEG) ispis+="39";
        else if(nekiGrad==Grad.BRCKO) ispis+="49";
        ispis+="/"+nekiBroj;
        return ispis;
    }

    @Override
    public int hashCode(){
        String poz=new String();
        if(nekiGrad==Grad.TRAVNIK) poz="30";
        else if(nekiGrad==Grad.ORASJE) poz="31";
        else if(nekiGrad==Grad.ZENICA) poz="32";
        else if(nekiGrad==Grad.SARAJEVO) poz="33";
        else if(nekiGrad==Grad.LIVNO) poz="34";
        else if(nekiGrad==Grad.TUZLA) poz="35";
        else if(nekiGrad==Grad.MOSTAR) poz="36";
        else if(nekiGrad==Grad.BIHAC) poz="37";
        else if(nekiGrad==Grad.GORAZDE) poz="38";
        else if(nekiGrad==Grad.SIROKIBRIJEG) poz="39";
        else if(nekiGrad==Grad.BRCKO) poz="49";
        return poz.hashCode()+nekiGrad.hashCode();
    }
}
