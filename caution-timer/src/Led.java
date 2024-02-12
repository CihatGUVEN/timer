public class Led {
    int level;
    boolean isActive;

    public void run(int time) {
        if (time == 5) {
            System.out.println("Led 1. seviyede yandı");
            return;
        } else if (time == 10) {
            System.out.println("Led 2. seviyede yandı");
            return;
        }
        else if (time == 15) {
            System.out.println("Led 3. seviyede yandı");
            return;
        }
    }
}
// timer a göre yanacak. Kademeleri olacak
// timer, level, active
