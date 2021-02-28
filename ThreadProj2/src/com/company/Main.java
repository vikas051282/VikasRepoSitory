package com.company;

class Runner implements Runnable {
    @Override
    public void run(){
        for(int ctr=0;ctr<100;ctr++){
            System.out.println(Thread.currentThread());
        }

    }
}

public class Main {

    public static void main(String[] args) {
        // write your code here
        Thread mainThread=Thread.currentThread();
       Runner runner=new Runner();
        Thread thread1= new Thread(new Runner());
        Thread thread2= new Thread(new Runner());
        thread1.start();
        thread2.start();

        System.out.println("end");

    }
}
