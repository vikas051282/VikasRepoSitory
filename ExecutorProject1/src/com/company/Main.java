package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Runner implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread());
    }
}


public class Main {

    public static void main(String[] args) {
	int coreCount=Runtime.getRuntime().availableProcessors();
        ExecutorService service= Executors.newFixedThreadPool(coreCount);
        for (int counter=0; counter<10;counter++){
            service.execute(new Runner());
        }
    }
}
