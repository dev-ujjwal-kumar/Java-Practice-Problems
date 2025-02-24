package Java.Multithreading.producerConsumer;

public class main {
    public static void main(String[] args){
        Company c = new Company();
        Consumer consumer = new Consumer(c);
        Producer producer = new Producer(c);

        producer.start();
        consumer.start();

    }
}
