//    ✅ Pros:
//        ✔ Instance is only created when needed → Better memory efficiency.
//        ✔ Simple to implement.
//
//    ❌ Cons:
//        ❌ Not thread-safe → Multiple threads may create multiple instances.
//        ❌ Needs additional synchronization for thread safety.
public class LazyInitilization{
    private static final LazyInitilization lazyInitilization; //not created at start

    private lazyInitilization(){}

    public static LazyInitilization getInstance(){
        if(lazyInitilization == null){
            lazyInitilization = new lazyInitilization(); // only created when needed
        }
        return lazyInitilization;
    }
}