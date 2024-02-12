public class Buzzer {
    // timer bağlı olarak kademeli ses çıkaracak
    // timer, level, active

    int level;
    boolean isActive;

    public void run(int time) {
        if (time == 5) {
            System.out.println("Bazer 1. seviyede öttü");
            return;
        } else if (time == 10) {
            System.out.println("Bazer 2. seviyede öttü");
            return;
        }
        else if (time == 15) {
        System.out.println("Bazer 3. seviyede öttü");
        return;
    }
    }
}
