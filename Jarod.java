import java.io.*;
import java.util.*;
public class Jarod extends Personnage{
    public Jarod(int x,int y,int h,int l,String nouvNom,int part){
        super(x,y,h,l,nouvNom);
        down =Textures.dude;
        left =Textures.dude;
        right =Textures.dude;
        up =Textures.dude;
        chargerTexte(part);
    }

    public void chargerTexte(int partie){
        this.dialogue=new Dialogue("entites/Jarod/texte/",partie,nom);
    }
}