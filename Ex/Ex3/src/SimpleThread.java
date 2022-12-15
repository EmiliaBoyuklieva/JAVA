
//test1
/*
public class SimpleThread extends Thread {

    public SimpleThread(String str) {
        super(str);
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            // System.out.format("%d %s%n", i, getName());
            try {
                sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
            }
        }
        System.out.format("DONE! %s%n", getName());
    }
}

*/

//test2
/*
public class SimpleThread extends Thread {

    public SimpleThread(String str) {
        super(str);
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            // System.out.format("%d %s%n", i, getName());
            try {
                sleep((long)(Math.random() * 1000));
            } catch (InterruptedException e) {}
        }
        System.out.format("DONE! %s%n", getName());
    }
}

*/
//test 3

public class SimpleThread extends Thread {

    public SimpleThread(String str) {
        super(str);
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + getName()
                    + " Priority = " + getPriority());
        }
        System.out.println("Done! " + getName());
    }
}