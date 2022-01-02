import java.awt.event.*;
import java.util.Scanner;
import java.awt.Rectangle;

public class InputsJouer extends KeyAdapter{
    public static boolean entreePresse=false; 

    public void keyPressed(KeyEvent ke){
        
        // -------------------------PARTIE JOUER
            
        switch(ke.getKeyCode()){
            case 81://q
                if(!main.fen.pan.joueur.enInteraction)
                    main.fen.pan.joueur.bouger(-1,0);
                break;
            case 90://z
                if(!main.fen.pan.joueur.enInteraction)
                    main.fen.pan.joueur.bouger(0,-1);
                break;
            case 68://d
                if(!main.fen.pan.joueur.enInteraction)
                    main.fen.pan.joueur.bouger(1,0);
                break;
            case 83://s
                if(!main.fen.pan.joueur.enInteraction)
                    main.fen.pan.joueur.bouger(0,1);
                break;
            case 10:
                if(entreePresse==false){
                    entreePresse=true;
                    main.fen.pan.joueur.interagit();
                }
                break;
            default:
                //System.out.println(main.fen.pan.niveau.entites.get(0));
                //System.out.println("yo mec "+ke.getKeyChar());
                //System.out.println("yo mec "+ke.getKeyCode());
                break;
        }
    }

    public void keyReleased(KeyEvent ke){
        switch(ke.getKeyCode()){
                case 81://q
                    break;
                case 90://z
                    break;
                case 68://d
                    break;
                case 83://s
                    break;
                case 10:
                    entreePresse=false;
                    break;
                
                default:
                    //System.out.println("yo mec "+ke.getKeyChar());
                    break;
        }
    }
}