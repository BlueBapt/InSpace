public class Maj extends Thread{

    public Maj(){
        super();
    }

    @Override
    public void run(){
        while(true){
            try{
                main.fen.repaint();
                Thread.sleep(10);
            }catch(Exception e){
                e.printStackTrace();
            }

            
            
        }
    }
}