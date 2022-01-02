import java.awt.Image;
import java.util.*;
public abstract class Objet extends Entite implements HasSprite,HasTexte{
    public String nom;
    public boolean parlant;
    public Dialogue dialogue;

    public Image sprite;


    public Objet(int x,int y,int h,int l,String nouvNom){
        super(x,y,h,l);
        this.nom=nouvNom;
    } 

    public Image getImage(){
        return this.sprite;
    }

    public void interagit(){
        if(main.fen.pan.dialogue==null){
            main.fen.pan.dialogue=this.dialogue;
            main.fen.pan.joueur.enInteraction=true;
        }else if(main.fen.pan.dialogue==this.dialogue){
            if(this.dialogue.estFini()){
                main.fen.pan.dialogue=null;
                this.dialogue.revenirZero();
                main.fen.pan.joueur.enInteraction=false;
            }else{
                this.dialogue.avancer();
            }
        }
    } 

    public abstract void chargerTexte(int partie);

    public boolean equals(Object o){
        if(o instanceof Objet){
            if(nom.equals(((Objet)o).nom)){
                return true;
            }
        }
        return false;
    }
}