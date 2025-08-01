package designPatterns.chainOfResponsibility;

public class FiveHundredMoneyDispenser implements MoneyDispenser{
    private int numberOfFiveHundredNotes;
    private MoneyDispenser nextMoneyDispenser;

    public FiveHundredMoneyDispenser(int numberOfFiveHundredNotes,MoneyDispenser moneyDispenser){
        this.nextMoneyDispenser = moneyDispenser;
        this.numberOfFiveHundredNotes = numberOfFiveHundredNotes;
    }

    public int getNumberOfFiveHundredNotes() {
        return numberOfFiveHundredNotes;
    }

    public void setNumberOfFiveHundredNotes(int numberOfFiveHundredNotes) {
        this.numberOfFiveHundredNotes = numberOfFiveHundredNotes;
    }

    public MoneyDispenser getNextMoneyDispenser() {
        return nextMoneyDispenser;
    }

    public void setNextMoneyDispenser(MoneyDispenser nextMoneyDispenser) {
        this.nextMoneyDispenser = nextMoneyDispenser;
    }

    @Override
    public void dispenseMoney(int money) {
        int notesRequired = money / 500;
        int moneyLeft = 0;
        int fiveHundredNotesToDispense = 0;
        if(numberOfFiveHundredNotes >= notesRequired){
            numberOfFiveHundredNotes -= notesRequired;
            fiveHundredNotesToDispense = notesRequired;
            moneyLeft = money - notesRequired * 500;
        } else{
            fiveHundredNotesToDispense = numberOfFiveHundredNotes;
            numberOfFiveHundredNotes = 0;
            moneyLeft = money - 500 * fiveHundredNotesToDispense;
        }

        System.out.println("Five Hundred notes dispensed are " + fiveHundredNotesToDispense + " so total money in thousand notes "
                + fiveHundredNotesToDispense * 500);
        if(moneyLeft > 0 && nextMoneyDispenser != null){
            nextMoneyDispenser.dispenseMoney(moneyLeft);
        }else{
            System.out.println("Can only fulfil this much money request");
        }

    }
}
