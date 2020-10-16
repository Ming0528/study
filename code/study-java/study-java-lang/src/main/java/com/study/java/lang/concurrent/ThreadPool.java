package com.study.java.lang.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Test;

public class ThreadPool {
    private static final int THREAD_CNT = 1;
    private static final long THREAD_KEEP_ALIVE_TIME = 0L;
    private static final String THREAD_NAME_FORMAT = "supplement-reconcile-pool-%d";

    @Test
    public void testSubmit() {
        ExecutorService executorService = Executors.newCachedThreadPool();

        try {
            executorService.submit(() -> {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    System.out.println(" 子线程 finally done");
                }
                System.out.println(" 子线程 done");
            });
        }
        catch (Exception e) {
            System.out.println("error");
        }
        finally {
            executorService.shutdown();
        }

        System.out.println("主线程 end");
    }
}
