//    ✅ Pros:
//        ✔ Thread-safe → Ensures only one instance is created across multiple threads.
//        ✔ Ensures lazy initialization.
//
//    ❌ Cons:
//        ❌ Performance overhead → Every call to getInstance() is synchronized, which reduces performance

public class ThreadSafeLazyInitialization {
    private static volatile ThreadSafeLazyInitialization instance;

    private ThreadSafeLazyInitialization() {}

    public static ThreadSafeLazyInitialization getInstance() {
        if (instance == null) { // First check (no locking)
            synchronized (ThreadSafeLazyInitialization.class) {
                if (instance == null) { // Second check (with lock)
                    instance = new ThreadSafeLazyInitialization();
                }
            }
        }
        return instance;
    }
}
// volatile ensures visibility and prevents half-initialized objects from being seen by other threads due to instruction reordering.

// Double-checked locking reduces synchronization overhead after the instance is created.
