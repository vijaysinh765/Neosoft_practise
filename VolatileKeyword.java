package multithreading;


public class VolatileKeyword {
    private volatile boolean flag = false;

    public void toggleFlag() {
        flag = !flag;
    }

    public boolean isFlag() {
        return flag;
    }

    public static void main(String[] args) {
    	VolatileKeyword example = new VolatileKeyword();

        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(1000);  // Simulate some work
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            example.toggleFlag();
            System.out.println("Flag set to true");
        });

        Thread readerThread = new Thread(() -> {
            while (!example.isFlag()) {
                // Spin until the flag becomes true
            }
            System.out.println("Flag is now true");
        });

        writerThread.start();
        readerThread.start();

        try {
            writerThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

