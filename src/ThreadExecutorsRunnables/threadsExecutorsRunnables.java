/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadExecutorsRunnables;

/**
 *
 * @author mikeg
 */
public class threadsExecutorsRunnables {

    public static void main(String args[]) {

        RunnableDemo R1 = new RunnableDemo("Thread-1");
        R1.start();
        R1.run();

        RunnableDemo R2 = new RunnableDemo("Thread-2");
        R2.start();
    }

}

class RunnableDemo implements Runnable {
    private Thread t;
    private String threadName;

    RunnableDemo( String name){
        threadName = name;
        System.out.println("This creates thread-" + threadName );
    }
    public void run() {
        System.out.println("Running " + threadName );
        try {
            for(int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // Let the thread sleep for a while.
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread" + threadName + "interrupted.");
        }
        System.out.println("Thread" + threadName + "exiting.");
    }

    public void start () 
    {
        System.out.println("Starting " + threadName );
        if (t == null) 
        {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}
