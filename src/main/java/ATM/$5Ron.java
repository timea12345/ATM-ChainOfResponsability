package ATM;

public class $5Ron extends Bancnote {

    private int amount;

    //constructor
    public $5Ron(Bancnote nextBancnote) {
        super(nextBancnote);
        this.amount = 10;
    }

    @Override
    int giveMoney(int rest) {
        int amountToGive = rest / 5;

        try {
            if (amountToGive != 0) {
                if (amountToGive <= this.amount) {
                    System.out.println(amountToGive + " x 5 ron");
                    return nextBancnote.giveMoney(rest % 5);
                } else if (nextBancnote != null) {
                    System.out.println(this.amount + " x 5 ron");
                    return nextBancnote.giveMoney(rest % 5 + (amountToGive - this.amount) * 5);
                }
            }
        return nextBancnote.giveMoney(rest);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException catch");
        }
        return 0;
    }

}
