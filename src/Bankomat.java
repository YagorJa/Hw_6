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

    public boolean moneyOutB(int lave) {
        if (bablo < lave) {
            return false;
        }
        int count100 = Math.min(lave / 100, this.bill100);
        lave -= count100 * 100;
        this.bill100 -= count100;

        int count50 = Math.min(lave / 50, this.bill50);
        lave -= count50 * 50;
        this.bill50 -= count50;

        int count20 = Math.min(lave / 20, this.bill20);
        lave -= count20 * 20;
        this.bill20 -= count20;

        if (lave > 0) {
            return false;
        }

        this.bablo -= lave;
        System.out.println("Выдано купюр: " + count100 + " х 100, " + count50 + " х 50, " + count20 + " х 20");
        return true;
    }
    }

