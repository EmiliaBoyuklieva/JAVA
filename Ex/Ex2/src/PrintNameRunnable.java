// The class implements Runnable interface

//Test1
/*
class PrintNameRunnable implements Runnable {

    String name;

    PrintNameRunnable(String name) {
        this.name = name;
    }

    // Implementation of the run() defined in the
    // Runnable interface.
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(name);
        }
    }
}
*/


//test2

// The class implements Runnable interface
class PrintNameRunnable implements Runnable {

    Thread thread;

    PrintNameRunnable(String name) {
        thread = new Thread(this, name);
        thread.start();
    }

    // Implementation of the run() defined in the
    // Runnable interface.
    public void run() {
        String name = thread.getName();
        for (int i = 0; i < 10; i++) {
            System.out.print(name);
        }
    }
}

