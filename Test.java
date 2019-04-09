public class Test {

    public static void main(String ar[]) {
        Test1 t = new Test1();
        Test1 t2 = new Test1();
        Test1 t3 = new Test1();
        Thread tt = new Thread(t);
        Thread tt2 = new Thread(t2);
        Thread tt3 = new Thread(t3);
        Thread tt4 = new Thread(t);
        Thread tt5 = new Thread(t);
        tt.start();
        tt2.start();
        tt3.start();
        tt4.start();
        tt5.start();

    }
}

final class Test1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + SingletonMultipleThreads.getInstance().hashCode());
        }
    }

}
    class SingletonMultipleThreads {
  
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