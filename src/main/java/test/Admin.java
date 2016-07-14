package test;

import com.sun.corba.se.impl.activation.NameServiceStartThread;

/**
 * Created by admin on 2016/4/6.
 */
public class Admin {

    public static void main(String[] arg){

        Thread t1 = new Thread(new T1());
        t1.start();
       /* try {
            t1.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        Thread t2 = new Thread(new T2());
        t2.start();
    }


    static class T1 implements Runnable {
        public  T1() {
        }
        @Override
        public void run() {
            for (int i=0;i<5;i++){
                System.out.println(Thread.currentThread().getName() + "加线程"+i);
            }
        }
    }

    static  class T2 implements Runnable {
            public T2() {
            }
            @Override
            public void run() {
                for (int i=5;i>0;i--){
                    System.out.println(Thread.currentThread().getName() + "减线程"+i);
                }
            }
        }
    }
