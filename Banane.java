import java.util.*;
public class Banane extends Objet{
    public Banane(int x,int y,int h,int l,String nouvNom){
        super(x,y,h,l,nouvNom);
        sprite=Textures.dude;
        chargerTexte(0);
    }

    public void chargerTexte(int partie){
        ArrayList<String> texte=new ArrayList<String>();
        texte.add("Vous avez trouve une banane!");
        texte.add("elle a ete ajoutee a votre inventaire.");
        this.dialogue=new Dialogue(nom,texte);
    }

    public String toString(){
        return "banane";
    }
}