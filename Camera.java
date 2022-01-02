import java.io.Serializable;
public class Camera implements Serializable{
    int x;
    int y;
    double zoom;

    public Camera(int x,int y,double zoom){
        this.x=x;
        this.y=y;
        this.zoom=zoom;
    }
}