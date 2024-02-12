public class Timer {

    // timer da bir tane sayaç çalışır. sayaç zamanla artar. Ve değerine göre bazer ve led i tetikler.
int time= 0;
    int counter;

    Buzzer buzzer = new Buzzer();
    Led led = new Led();

    public void updateLevels(int counter, int buzzerlevel, int ledlevel){
        this.counter = counter;
        this.buzzer.level = buzzerlevel;
        this.led.level = ledlevel;
    }

    public void run() throws InterruptedException {
        time = 0;
        while(true){
            // işlemleri yap
            buzzer.run(time);
            led.run(time);
            Thread.sleep(5000);
            time +=5;

            if(counter<time)
                break;
        }
    }

    public void restartCounter(){
        time = 0;
    }
}
