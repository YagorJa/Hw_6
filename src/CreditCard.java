public class CreditCard {
    int cardNumber;
    double moneyCheck;

    public CreditCard(int cardNumber, double moneyCheck) {
        this.cardNumber = cardNumber;
        this.moneyCheck = moneyCheck;
    }

    public void moneyAdd(double moneyP) {
        moneyCheck += moneyP;
    }

    public void moneyOut(double moneyM) {
        if (moneyM <= moneyCheck) {
            moneyCheck -= moneyM;
        } else System.out.println("НЕДОСТАТОЧНО средств на карте " + cardNumber + "\n");
    }

    public void moneySout() {
        System.out.println("Номер банковской карты: " + cardNumber);
        System.out.println("Текущий баланс: " + moneyCheck + "$");
    }
}

