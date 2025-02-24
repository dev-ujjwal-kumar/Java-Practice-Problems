package Java.Multithreading.producerConsumer;

public class Consumer extends Thread{
    Company c;

    Consumer(Company c){
        this.c = c;
    }

    @Override
    public void run(){
        while(true){           
            try{
                c.consume();
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
}
