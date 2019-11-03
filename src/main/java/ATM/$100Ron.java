package ATM;

public class $100Ron extends Bancnote {

    private int amount;

    //constructor
    public $100Ron(Bancnote nextBancnote) {
        super(nextBancnote);
        this.amount = 30;
    }


    @Override
    int giveMoney(int rest) {
        int amountToGive = rest / 100;

        try {
            if (amountToGive != 0) {
                if (amountToGive <= this.amount) {
                    System.out.println(amountToGive + " x 100 ron");
                    return nextBancnote.giveMoney(rest % 100);
                } else if (nextBancnote != null) {
                    System.out.println(this.amount + " x 100 ron");
                    return nextBancnote.giveMoney(rest % 100 + (amountToGive - this.amount) * 100);
                }
            }
        return nextBancnote.giveMoney(rest);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException catch");
        }
        return 0;
    }

}
