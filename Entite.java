import java.awt.Rectangle;
public abstract class Entite extends Rectangle{

    public Entite(int x,int y,int h,int l){
        super(x,y,h,l);
    } 

    public abstract void interagit();

    public void bouger(int x,int y){
        this.setLocation((int)this.getX()+x,(int)this.getY()+y);
    }
    
}