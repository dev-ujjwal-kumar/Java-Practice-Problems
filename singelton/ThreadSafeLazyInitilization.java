//    ✅ Pros:
//        ✔ Thread-safe → Ensures only one instance is created across multiple threads.
//        ✔ Ensures lazy initialization.
//
//    ❌ Cons:
//        ❌ Performance overhead → Every call to getInstance() is synchronized, which reduces performance

public class ThreadSafeLazyInitilization{
    private static final ThreadSafeLazyInitilization instance;

    private ThreadSafeLazyInitilization(){};

    public static synchronized ThreadSafeLazyInitilization getInstance(){
        if(instance == null){
            instance = new ThreadSafeLazyInitilization();
        }
        return instance;
    }
}