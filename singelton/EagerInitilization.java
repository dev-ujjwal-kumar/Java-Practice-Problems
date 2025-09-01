//    ✅ Pros:
//        ✔ Thread-safe (JVM ensures the instance is created before any thread accesses it).
//        ✔ Simple & easy to implement.
//
//    ❌ Cons:
//        ❌ Instance is created even if never used, leading to unnecessary memory usage.
//        ❌ Not suitable if instance creation is expensive and might never be needed.

public class EagerInitilization{
    private static final EagerInitilization eagerInitilization= new EagerInitilization(); //Creating the instance at the calss loading

    private eagerInitilization(){} //making constructor as private

    public static EagerInitilization getInstance(){ // returning the initialized class
        return eagerInitilization;
    }
}