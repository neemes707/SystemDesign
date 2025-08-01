package designPatterns.chainOfResponsibility;

public class HundredMoneyDispenser implements MoneyDispenser{
    private int numberOfHundredNotes;
    private MoneyDispenser nextMoneyDispenser;

    public HundredMoneyDispenser(int numberOfHundredNotes,MoneyDispenser moneyDispenser){
        this.nextMoneyDispenser = moneyDispenser;
        this.numberOfHundredNotes = numberOfHundredNotes;
    }

    public int getNumberOfTwoHundredNotes() {
        return numberOfHundredNotes;
    }

    public void setNumberOfTwoHundredNotes(int numberOfHundredNotes) {
        this.numberOfHundredNotes = numberOfHundredNotes;
    }

    public MoneyDispenser getNextMoneyDispenser() {
        return nextMoneyDispenser;
    }

    public void setNextMoneyDispenser(MoneyDispenser nextMoneyDispenser) {
        this.nextMoneyDispenser = nextMoneyDispenser;
    }

    @Override
    public void dispenseMoney(int money) {
        int notesRequired = money / 100;
        int moneyLeft = 0;
        int hundredNotesToDispense = 0;
        if(numberOfHundredNotes >= notesRequired){
            numberOfHundredNotes -= notesRequired;
            hundredNotesToDispense = notesRequired;
            moneyLeft = money - notesRequired * 100;
        } else{
            hundredNotesToDispense = numberOfHundredNotes;
            numberOfHundredNotes = 0;
            moneyLeft = money - 100 * hundredNotesToDispense;
        }

        System.out.println("Two Hundred notes dispensed are " + hundredNotesToDispense + " so total money in thousand notes "
                + hundredNotesToDispense * 100);
        if(moneyLeft > 0 && nextMoneyDispenser != null){
            nextMoneyDispenser.dispenseMoney(moneyLeft);
        }else{
            System.out.println("Can only fulfil this much money request");
        }
    }
}
