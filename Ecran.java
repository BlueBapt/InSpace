import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.imageio.ImageIO;
import java.awt.BorderLayout;
import java.io.IOException;
import java.io.File;
import java.awt.Image;
import java.awt.Dimension;
import java.awt.event.*;
import java.awt.Rectangle;
import java.util.*;
public class Ecran extends JFrame{

	public Panneau pan = new Panneau();
	public Maj refresher = new Maj();

	public Ecran(){
		
		pan.setPreferredSize(new Dimension(720,480));
		//this.setPreferredSize(new Dimension(720,480));
		this.setTitle("In Space");
		try{
			this.setIconImage(ImageIO.read(new File("textures/icone.png")));
		}catch (Exception e){
			System.exit(1);
		}
		
		this.setResizable(true);
		this.setLocation(0,0);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(pan);
		pan.requestFocus();
		this.pack();
		this.setMinimumSize(new Dimension(this.getWidth(),this.getHeight()));
		this.setVisible(true);
		
		this.addKeyListener(new InputsJouer());
		this.go();

	}    
	public void go(){
		System.out.println("énorme");
	}


}
