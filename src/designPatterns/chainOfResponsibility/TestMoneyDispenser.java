package designPatterns.chainOfResponsibility;
/**Chain of Responsibility design pattern is useful when the request made by the client goes through multiple request
 * handlers - first handler check if it can handle the request or not , if not it passes the request to next
 * handler (it stores the reference of the next handler HAS- A relationship)*/
public class TestMoneyDispenser {
    public static void main(String[] args) {
        MoneyDispenser moneyDispenser = new ThousandNoteDispenser(1,
                new FiveHundredMoneyDispenser(3,
                        new HundredMoneyDispenser(10,null)));

        moneyDispenser.dispenseMoney(3150);
    }
}
