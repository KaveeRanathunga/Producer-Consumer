import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SharedQueue {
    Queue<PrintJobs> queue ;


    public SharedQueue(){
        this.queue =new LinkedList<>();

    }

    public synchronized void add(PrintJobs printJobs){
            while(queue.size()==5){
                try{
                    wait();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }

            queue.add(printJobs);


            System.out.println(Thread.currentThread().getName()+" add a print job "+printJobs.getName());
            notifyAll();

        try{
            Thread.sleep(1000);
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public synchronized void remove(){
        while(queue.size()==0){
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }

        PrintJobs printJobs = queue.poll();
        System.out.println(Thread.currentThread().getName()+ " done the "+ printJobs.getName()+"");
        notifyAll();

        try{
            Thread.sleep(1000);
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
