import java.awt.Image;
import java.util.*;
public class Joueur extends Entite implements HasSprite{
    public String orientation;
    public boolean enInteraction;
    public Entite enInteractionAvec;
    public ArrayList<Objet> inventaire;

    public Image down;
    public Image right;
    public Image left;
    public Image up;

    public Joueur(int x,int y,int h,int l){
        super(x,y,h,l);
        enInteraction=false;
        orientation="down";
        inventaire=new ArrayList<Objet>();

        down =Textures.hero;
        left =Textures.hero;
        right =Textures.hero;
        up =Textures.hero;
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
        if(enInteraction){
            enInteractionAvec.interagit();
        }else{
            main.fen.pan.niveau.entites.get(0).interagit();
            enInteractionAvec=main.fen.pan.niveau.entites.get(0);
        }
    }

    


}