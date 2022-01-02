public class main{

    public static Ecran fen;
    public static Maj refresher = new Maj();

    public static void main(String[]args){
        Textures.chargerImages();
        fen = new Ecran();
        refresher.run();
    }
}