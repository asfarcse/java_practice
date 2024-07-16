package Thread;

public class SleepExample {
    public static void main(String[] args) {
        System.out.println("Program started...");
        try {
            System.out.println("Sleeping for 3 seconds...");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Program resumed after sleep.");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Doing some work: " + i);
        }
        System.out.println("Program completed.");
    }
}

