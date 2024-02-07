public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");

        Timer timer = new Timer();
        timer.updateLevels(10, 4 ,3);
        try {
            timer.run();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Thread.sleep(10000);


        timer.restartCounter();
    }
}