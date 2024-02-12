public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");

        Timer timer = new Timer();
        timer.updateLevels(20, 4 ,3);
        try {
            timer.run();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        /*
        
         */
        timer.restartCounter();

        try {
            timer.run();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}