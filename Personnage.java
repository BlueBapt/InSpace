import java.awt.Image;
import java.util.*;
public abstract class Personnage extends Entite implements HasSprite,HasTexte{
    public String orientation;
    public String nom;
    public boolean parlant;
    public Dialogue dialogue;

    public Image down;
    public Image right;
    public Image left;
    public Image up;

    public Personnage(int x,int y,int h,int l,String nouvNom){
        super(x,y,h,l);
        nom=nouvNom;
        parlant=false;
        orientation="down";
    }

    public Image getImage(){
        switch(orientation){
            case "down":
                return down;

            case "left":
                return left;

            case "right":
                return right;

            case "up":
                return up;
                
            default:
                return down;
        }
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

    


}