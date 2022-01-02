public class Activateur extends Entite{
    public Entite entiteLiee;

    public Activateur(int x,int y,int h,int l,Entite e){
        super(x,y,h,l);
        this.entiteLiee=e;
    }

    public void interagit(){
        entiteLiee.interagit();
        main.fen.pan.joueur.enInteractionAvec=entiteLiee;
    }

    public String toString(){
        return "Contient:"+entiteLiee.toString();
    }

}