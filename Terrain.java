import java.awt.Rectangle;
import java.awt.Image;

public class Terrain extends Rectangle implements HasSprite{
    public String nom;
    public boolean hasCollision;

    public Terrain(int x,int y,int lon,int hau,String n){
        super(x,y,lon,hau);
        this.nom=n;
    }

    public Terrain(int x,int y,int lon,int hau){
        super(x,y,lon,hau);
    }

    public Terrain(Terrain ter){
        super((Rectangle)ter);
        this.nom=ter.nom;
    }


    public void setColision(boolean t){
        this.hasCollision=t;
    }

    public Image getImage(){
        return Textures.bloc;
    }


}