package ATM;

public class $500Ron extends Bancnote {

    private int amount;

    //constructor
    public $500Ron(Bancnote nextBancnote) {
        super(nextBancnote);
        this.amount = 1000;
    }

    @Override
    int giveMoney(int rest) {
        int amountToGive = rest / 500;

        try {
            if (amountToGive != 0) {
                if (amountToGive <= this.amount) {
                    System.out.println(amountToGive + " x 500 ron");
                    return nextBancnote.giveMoney(rest % 500);
                } else if (nextBancnote != null) {
                    System.out.println(this.amount + " x 500 ron");
                    return nextBancnote.giveMoney(rest % 500 + (amountToGive - this.amount) * 500);
                }
            }
        return nextBancnote.giveMoney(rest);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException catch");
        }
        return 0;
    }

}
