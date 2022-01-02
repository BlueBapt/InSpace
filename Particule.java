import java.awt.*;
public class Particule{

    public Color couleur;
    public int vie;
    public int x;
    public int y;

    public Particule(){
        int coul= (int)(Math.random()*100);
        //int coul= 255;
        couleur = new Color(coul,coul,coul);
        vie = (int)(Math.random()*100)+50;
        x=(int)(Math.random()*720);
        y=(int)(Math.random()*480);
    }

    public void diminuerVie(){
        vie--;
    }

    public boolean estMorte(){
        return vie<=0;
    }

    public void afficher(Graphics g){
        g.setColor(couleur);
        g.fillRect((int)(x*Panneau.zoom),(int)(y*Panneau.zoom),(int)(2*Panneau.zoom),(int)(2*Panneau.zoom));
        diminuerVie();
    }


}