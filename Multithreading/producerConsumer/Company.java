package Java.Multithreading.producerConsumer;

public class Company {
    int n;
    boolean f = false;

    //f : true -> chance of Consumer
    //f : false -> chance of producer
    synchronized public void produce_item(int n) throws Exception{
        if(f){
            wait();
        }
        this.n = n;
        System.out.println("Item prodeced : " + n);
        f = true;
        notify();
    }

    synchronized  public int consume() throws Exception{
        if(!f){
            wait();            
        }
        System.out.println("Item consumed : " + n);
        f = false;
        notify();
        return n;
    }
    
}
