package test;

/**
 * Created by admin on 2016/4/21.
 */
public class ThreadTest {

    public static void main(String[] args){
        new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while(i<10){
                    System.out.println(Thread.currentThread().getName()+"线程>>i:"+ i++);
                }
            }
        }).start();
        int i = 10 ;
        while (i>0){
            System.out.println(Thread.currentThread().getName()+"主函数>>i:"+ i--);
        }
    }


}
