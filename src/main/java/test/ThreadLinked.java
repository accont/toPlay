package test;

/**
 * Created by admin on 2016/4/21.
 */
public class ThreadLinked {


    public static void main(String[] a){
        ThreadForWord t1 = new ThreadForWord();
      //  ThreadForWord t2 = new ThreadForWord();
     //   ThreadForWord t3 = new ThreadForWord();
        Thread tt1 = new Thread(t1);
        Thread tt2 = new Thread(t1);
        Thread tt3 = new Thread(t1);
        tt1.run();
        tt2.run();
        tt3.run();

    }


   static  class ThreadForWord implements Runnable{

       private int max_value = 0;

        @Override
        public void run() {
            ThreadForWord threadForWord = new ThreadForWord();
            synchronized (threadForWord){
                while (true){
                    if (max_value > 20){
                        break;
                    }
                    System.out.println(Thread.currentThread().getName() + "== " + max_value++);
                }
            }

        }
    }
}
