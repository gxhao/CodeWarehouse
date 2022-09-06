package com.xiao.demo.Async.AsyncThread;

import org.springframework.util.StopWatch;

/**
 * @author mghio
 * @since 2021-08-01
 */
public class ThreadAsync {

    public static void doOneThing() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("doOneThing ---->>> success");
    }

    public static void doOtherThing() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("doOtherThing ---->>> success");
    }

    public synchronized static void main(String[] args) throws InterruptedException {
        StopWatch stopWatch = new StopWatch("ThreadAsync");
        stopWatch.start();

        // 同步调用版本
        // testSynchronize();

        // 异步调用版本
        testAsynchronize();

        stopWatch.stop();
        System.out.println(stopWatch);
    }

    private static void testAsynchronize() throws InterruptedException {
        System.out.println("-------------------- testAsynchronize --------------------");

        // 创建一个线程执行 doOneThing
        Thread doOneThingThread = new Thread(ThreadAsync::doOneThing, "doOneThing-Thread");
        doOneThingThread.start();

        doOtherThing();
        // 等待 doOneThing 线程执行完成
        doOneThingThread.join();
    }

    private static void testSynchronize() {
        System.out.println("-------------------- testSynchronize --------------------");

        doOneThing();
        doOtherThing();
    }

}
