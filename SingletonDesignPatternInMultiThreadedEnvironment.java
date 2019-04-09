package in.bench.resources.singleton.design.pattern;
  
public class SingletonDesignPatternInMultiThreadedEnvironment {
  
    // Step 1: private static variable of INSTANCE variable
    private static volatile
        SingletonDesignPatternInMultiThreadedEnvironment INSTANCE;
  
    // Step 2: private constructor
    private SingletonDesignPatternInMultiThreadedEnvironment() {
  
    }
  
    // Step 3: Provide public static getInstance() method 
    // returning INSTANCE after checking
    public static SingletonDesignPatternInMultiThreadedEnvironment 
        getInstance() {
  
        // synchronized block
        synchronized
          (SingletonDesignPatternInMultiThreadedEnvironment.class){
          if(null == INSTANCE){
              INSTANCE = 
                new
                SingletonDesignPatternInMultiThreadedEnvironment();
          }
          return INSTANCE;
        }
    }
}