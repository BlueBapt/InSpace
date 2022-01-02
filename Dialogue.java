import java.util.*;
import java.awt.*;
import java.io.*;
public class Dialogue{

    public ArrayList<String> texte =new ArrayList<>();
    public int place = 0;
    public String nom;

    public Dialogue(String chemin,int partie,String nNom){
        nom=nNom;
        try{
            BufferedReader br = new BufferedReader(new FileReader(chemin+partie+".txt"));
            String phrase =br.readLine();
            while(phrase != null){
                //System.out.println(phrase);
                phrase=phrase.trim();
                texte.add(phrase);
                phrase =br.readLine();
            }
        }catch (Exception e){
            System.out.println("Aie dans la lecture du texte de "+nom+", partie "+partie);
            e.printStackTrace();
        }
    }

    public Dialogue(String nNom, ArrayList<String> txt){
        texte=txt;
        nom=nNom;
    }

    public void paintDialogue(Graphics g){
		g.setColor(Color.gray);
		g.fillRect(0,(int)(300*Panneau.zoom),(int)(720*Panneau.zoom),(int)(170*Panneau.zoom));

		g.setColor(Color.white);
		g.setFont(Textures.POLICE_nom);
		g.drawString(nom,(int)(20*Panneau.zoom),(int)(325*Panneau.zoom));

		g.setFont(Textures.POLICE_boiteDialogue);
		g.drawString(texte.get(place),(int)(40*Panneau.zoom),(int)(380*Panneau.zoom));
	}

    public boolean avancer(){
        place++;
        return estFini();
    }

    public void revenirZero(){
        place=0;
    }

    public boolean estFini(){
        if(place+1>=texte.size()){
            return true;
        }else{
            return false;
        }
    }
}