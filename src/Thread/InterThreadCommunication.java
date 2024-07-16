package Thread;

class SharedObject {
    boolean flag = false;

    synchronized void waitForFlag() {
        while (!flag) {
            try {
                wait(); // Wait until flag becomes true
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Flag is now true");
    }

    synchronized void setFlag() {
        flag = true;
        notify(); // Notify waiting threads that flag is now true
    }
}

public class InterThreadCommunication {
    public static void main(String[] args) {
        SharedObject sharedObject = new SharedObject();

        Thread t1 = new Thread(() -> sharedObject.waitForFlag());
        Thread t2 = new Thread(() -> sharedObject.setFlag());

        t1.start();
        t2.start();
    }
}

