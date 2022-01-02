import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.Image;
import java.io.File;
import java.awt.Font;
public class Textures{
    public static Image dude;
    public static Image hero;
    public static Image bloc;
    public static Image terre;

    public static Font POLICE_nom;
    public static float TPolice_nom = 20;

    public static Font POLICE_boiteDialogue;
    public static float TPolice_boiteDialogue = 24;



    public static void chargerImages(){
        try {
            dude = ImageIO.read(new File("textures/dude.png"));
            hero = ImageIO.read(new File("textures/hero.png"));
            bloc = ImageIO.read(new File("textures/Bloc.png"));
            terre = ImageIO.read(new File("textures/terre.png"));


            POLICE_nom=Font.createFont(Font.TRUETYPE_FONT,new File("police.ttf"));
            float size=20;
		    POLICE_nom=POLICE_nom.deriveFont(size);
            size=24;
            POLICE_boiteDialogue=POLICE_nom.deriveFont(size);

        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
}