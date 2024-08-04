public class Printer extends Thread{

    SharedQueue sharedQueue;

    public Printer(SharedQueue sharedQueue){
        this.sharedQueue = sharedQueue;
    }

    public void run(){
        while(true){
            sharedQueue.remove();

            try{
                Thread.sleep(100);
            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }

}
