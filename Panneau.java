import java.io.IOException;
import java.awt.*;
import javax.swing.JPanel;
import javax.imageio.ImageIO;
import java.util.*;
import java.awt.event.*;
import java.io.File;

public class Panneau extends JPanel{

	public Joueur joueur = new Joueur(0,0,30,30);
	public Level niveau;
	public ArrayList<Particule> particules;
	public Entite jarod=new Jarod(0,0,10,10,"Jarod",1);
	public Dialogue dialogue;
	public float largeur=720f;
	public float hauteur=480f;
	public static float zoom = 1;

	public Panneau(){
		super();
		particules = new ArrayList<>();
		for(int i=0;i<50;i++){
			particules.add(new Particule());
		}
		niveau = new Level("test");

		this.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){}
				//a faire
        	public void mouseEntered (MouseEvent e) {}
        	public void mouseExited (MouseEvent e) {}
        	public void mouseReleased (MouseEvent e ) {}
		});
	}
  
	public void paintComponent(Graphics g){
		super.paintComponent(g); 
		if(this.getWidth()/largeur>this.getHeight()/hauteur){
			zoom=(this.getHeight()/hauteur);
		}else{
			zoom=(this.getWidth()/largeur);
		}

		Textures.POLICE_nom= Textures.POLICE_nom.deriveFont(Textures.TPolice_nom*zoom);
		Textures.POLICE_boiteDialogue= Textures.POLICE_boiteDialogue.deriveFont(Textures.TPolice_boiteDialogue*zoom);

		Graphics2D g2D = (Graphics2D)g;

		//Set  anti-alias
		g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON); 

		// Set anti-alias for text
		g2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON); 


		//afficher l'espace
		g.setColor(Color.black);
		g.fillRect(0,0,(int)(this.getWidth()*zoom),(int)(this.getHeight()*zoom));

		//afficher les particules
		ArrayList<Particule> pMortes = new ArrayList<>();
		for(Particule p : particules){
			
			p.afficher(g);
			if(p.estMorte()){
				pMortes.add(p);
			}
		}
		for(Particule p : pMortes){
			particules.remove(p);
			particules.add(new Particule());
		}

		//afficher la planette
		g.drawImage(Textures.terre,(int)(100*zoom),(int)(200*zoom),(int)(200*zoom),(int)(200*zoom),null);
		
		

		//afficher le vaisseau bg

		//afficher le vaisseau blocs
		for(Terrain t:niveau.niv){
			g.drawImage(t.getImage(),(int)(t.getX()*zoom),(int)(t.getY()*zoom),(int)(t.getWidth()*zoom),(int)(t.getHeight()*zoom),null);
		}

		

		//afficher les entites
		//afficher le joueur
		g.drawImage(joueur.getImage(),(int)(joueur.getX()*zoom),(int)(joueur.getY()*zoom),(int)(joueur.getWidth()*zoom),(int)(joueur.getHeight()*zoom),null);
		//afficher les trucs au dessus

		if(dialogue!=null){
			dialogue.paintDialogue(g);
		}
		
		

  	}



	
}