package multithreading;

public class DaemanThreadCreation {
	
	public static void main(String[] args) {
        Thread daemonThread = new Thread(new DaemonTask());
        daemonThread.setDaemon(true); // Set the thread as a daemon thread
        daemonThread.start();

        System.out.println("Main thread exiting");
    }
}

class DaemonTask implements Runnable {

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Daemon thread is running");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
