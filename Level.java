import java.io.IOException;
import java.io.File;
import java.util.*;
import java.io.Serializable;
public class Level implements Serializable{
    public Camera cam;
    public ArrayList<Terrain> niv;
    public String nom;
    public ArrayList<Entite> entites;

    public Level(String nom){
        this.niv= new ArrayList<Terrain>();
        this.entites = new ArrayList<Entite>();
        //entites.add(new Activateur(0,0,0,0,new Banane(0,0,0,0,"")));
        entites.add(new Banane(0,0,0,0,"Banane"));
        this.nom=nom;
        this.cam=new Camera(0,0,1);
        this.niv.add(new Terrain(10,10,10,10));
        this.niv.add(new Terrain(20,20,20,20));
        this.niv.add(new Terrain(100,100,10,10));

    }

    public Level(ArrayList<Terrain> terter,String nom){
        this.niv=new ArrayList<Terrain>(terter);
        this.nom=nom;
    }

    public void ajouterTerrain(Terrain ter){
        this.niv.add(new Terrain(ter));
    }

    public void ajouterEntite(Entite e){
        this.entites.add(e);
    }

    public static Level chargerNiveau(String n){
        return new Level(n);
    }
}