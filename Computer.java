import java.util.Random;

public class Computer extends Thread{

    Random random = new Random();
    private String type = ".txt";

    SharedQueue sharedQueue;
    PrintJobs printJobs;

    public Computer(SharedQueue sharedQueue){
        this.sharedQueue = sharedQueue;
    }

    public void run() {
        while(true){
            int randomIntInRange = random.nextInt(2);

            if(randomIntInRange == 1)
                type = ".pdf";
            try {
                printJobs = new PrintJobs(type);
                sharedQueue.add(printJobs);

            }catch (TypeNotSupportException typeNotSupportException){
                System.out.println(typeNotSupportException);
            }


            try{
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }
}
