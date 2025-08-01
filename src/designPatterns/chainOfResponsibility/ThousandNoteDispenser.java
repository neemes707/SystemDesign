package designPatterns.chainOfResponsibility;

public class ThousandNoteDispenser implements MoneyDispenser{
    private int numberOfThousandNotes;
    private MoneyDispenser nextMoneyDispenser;

    public ThousandNoteDispenser(int numberOfThousandNotes,MoneyDispenser moneyDispenser){
        this.nextMoneyDispenser = moneyDispenser;
        this.numberOfThousandNotes = numberOfThousandNotes;
    }

    public int getNumberOfThousandNotes() {
        return numberOfThousandNotes;
    }

    public void setNumberOfThousandNotes(int numberOfThousandNotes) {
        this.numberOfThousandNotes = numberOfThousandNotes;
    }

    public MoneyDispenser getMoneyDispenser() {
        return nextMoneyDispenser;
    }

    public void setMoneyDispenser(MoneyDispenser moneyDispenser) {
        this.nextMoneyDispenser = moneyDispenser;
    }

    @Override
    public void dispenseMoney(int money) {
        int notesRequired = money / 1000;
        int moneyLeft = 0;
        int thousandNotesToDispense = 0;
        if(numberOfThousandNotes >= notesRequired){
            numberOfThousandNotes -= notesRequired;
            thousandNotesToDispense = notesRequired;
            moneyLeft = money - notesRequired * 1000;
        } else{
            thousandNotesToDispense = numberOfThousandNotes;
            numberOfThousandNotes = 0;
            moneyLeft = money - 1000 * thousandNotesToDispense;
        }

        System.out.println("Thousand notes dispensed are " + thousandNotesToDispense + " so total money in thousand notes "
                + thousandNotesToDispense * 1000);
        if(moneyLeft > 0 && nextMoneyDispenser != null){
            nextMoneyDispenser.dispenseMoney(moneyLeft);
        }else{
            System.out.println("Can only fulfil this much money request");
        }

    }

}
