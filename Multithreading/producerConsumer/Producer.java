package Java.Multithreading.producerConsumer;
public class Producer extends Thread {

    Company c;

    Producer(Company c){
        this.c = c;
    }

    @Override
    public void run(){
        int i = 1;
        while(true){
            try{
                c.produce_item(i++);            
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
}
