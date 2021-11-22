package SyntaxClass21Overriding;

public class CreditCardTester {
    public static void main(String[] args) {

        CreditCard creditCard=new CreditCard(100);
        creditCard.calculateInterest();
        Ax ax=new Ax(200);
        ax.calculateInterest();
        Visa visa=new Visa(300);
        visa.calculateInterest();



    }
}
