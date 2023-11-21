public class CreditCard {
    int cardNumber;
    double moneyCheck ;

    public CreditCard(int cardNumber, double moneyCheck) {
        this.cardNumber = cardNumber;
        this.moneyCheck = moneyCheck;
    }
 public void moneyAdd()
    {
    double moneyP = 2000;
         moneyCheck += moneyP;
    }
public void moneyOut() {
        double moneyM = 600;
        moneyCheck -= moneyM;
}
public void moneySout(){
    System.out.println(moneyCheck);
}
}

