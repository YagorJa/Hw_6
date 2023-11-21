public class Main {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard(7347474, 8000);
         CreditCard card2 = new  CreditCard(645644,6784.42);
         CreditCard card3 = new CreditCard(333335, 1983.54);
         card1.moneyAdd(436.08);
         card2.moneyAdd(1200);
         card3.moneyOut(1985);
       card1.moneySout();
       card2.moneySout();
       card3.moneySout();
    }
}
