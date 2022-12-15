
/*
//test1
public class PrintStringsThread implements Runnable {

    Thread thread;
    String str1, str2;

    PrintStringsThread(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
        thread = new Thread(this);
        thread.start();
    }

    public void run() {
        TwoStrings.print(str1, str2);
    }

}
*/

//test2

/*
public class PrintStringsThread implements Runnable {

    Thread thread;
    String str1, str2;

    PrintStringsThread(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
        thread = new Thread(this);
        thread.start();
    }

    public void run() {
        TwoStrings.print(str1, str2);
    }
}
*/

//test3
public class PrintStringsThread implements Runnable {

    Thread thread;
    String str1, str2;
    TwoStrings ts;

    PrintStringsThread(String str1, String str2,
                       TwoStrings ts) {
        this.str1 = str1;
        this.str2 = str2;
        this.ts = ts;
        thread = new Thread(this);
        thread.start();
    }

    public void run() {
        // Synchronize over TwoString object
        synchronized (ts) {
            ts.print(str1, str2);
        }
    }
}