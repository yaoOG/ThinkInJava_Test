package com.concurrent;//: concurrency/SyncObject.java
// Synchronizing on another object.

import static net.mindview.util.Print.*;

class DualSynch {
    private Object syncObject = new Object();

    public synchronized void f() {
        for (int i = 0; i < 5; i++) {
            print("f()"+Thread.currentThread().getName());
            Thread.yield();
        }
    }

    public  void g() {
        synchronized (syncObject) {
            for (int i = 0; i < 5; i++) {
                print("g()"+Thread.currentThread().getName());
                Thread.yield();
            }
        }
    }
}

public class SyncObject {
    public static void main(String[] args) throws InterruptedException {
        final DualSynch ds = new DualSynch();
        new Thread() {
            @Override
            public void run() {
                ds.f();
            }
        }.start();
        ds.g();
    }
} /* Output: (Sample)
g()
f()
g()
f()
g()
f()
g()
f()
g()
f()
*///:~
