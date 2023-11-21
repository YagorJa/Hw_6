public class Bankomat {
    int bill20;
    int bill50;
    int bill100;
    int bablo;

    public Bankomat(int bill20, int bill50, int bill100) {
        this.bill20 = bill20;
        this.bill50 = bill50;
        this.bill100 = bill100;
        this.bablo =  (bill20 * 20) + (bill50 * 50) + (bill100 * 100);
    }

    public void moneyAddB(int bill20, int bill50, int bill100,int bablo) {
        this.bill20 += bill20;
        this.bill50 += bill50;
        this.bill100 += bill100;
        bablo= (bill20 * 20) + (bill50 * 50) + (bill100 * 100);
         this.bablo = bablo;
    }

    public boolean moneyOutB(int bill20, int bill50, int bill100) {
        this.bill20 -= bill20;
        this.bill50 -= bill50;
        this.bill100 -= bill100;
         int lave = (bill20 * 20) + (bill50 * 50) + (bill100 * 100);
        if (this.bablo <= lave ) {
return false;
        }else return true;
    }
}
