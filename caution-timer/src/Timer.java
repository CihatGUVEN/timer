public class Timer {

    // timer da bir tane sayaç çalışır. sayaç zamanla artar. Ve değerine göre bazer ve led i tetikler.

    int counter;

    Buzzer buzzer = new Buzzer();
    Led led = new Led();

    public void updateLevels(int counter, int buzzerlevel, int ledlevel){
        this.counter = counter;
        this.buzzer.level = buzzerlevel;
        this.led.level = ledlevel;
    }

    public void run() throws InterruptedException {
        int time = 0;
        while(true){
            // işlemleri yap
            buzzer.run(counter, time);
            led.run(counter, time);
            Thread.sleep(5000);
            time +=5;

            if(counter<time)
                break;
        }
    }

    public void restartCounter(){
        counter = 0;
    }
}
