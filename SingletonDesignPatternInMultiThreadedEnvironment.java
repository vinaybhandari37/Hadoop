public class SingletonMultipleThreads {
  
    // Private static variable of INSTANCE variable
    private static volatile
        SingletonMultipleThreads INSTANCE;
  
    // Private constructor
    private SingletonMultipleThreads() {
  
    }
  
    // Provide public static getInstance() method 
    // returning INSTANCE after checking
    public static SingletonMultipleThreads 
        getInstance() {
  
        // synchronized block
        synchronized
          (SingletonMultipleThreads.class){
          if(null == INSTANCE){
              INSTANCE = 
                new
                SingletonMultipleThreads();
          }
          return INSTANCE;
        }
    }
}
