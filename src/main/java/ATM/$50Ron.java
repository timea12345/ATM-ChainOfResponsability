package ATM;

public class $50Ron extends Bancnote {

    private int amount;

    //constructor
    public $50Ron(Bancnote nextBancnote) {
        super(nextBancnote);
        this.amount = 15;
    }


    @Override
    int giveMoney(int rest) {
        int amountToGive = rest / 50;

        try {
            if (amountToGive != 0) {
                if (amountToGive <= this.amount) {
                    System.out.println(amountToGive + " x 50 ron");
                    return nextBancnote.giveMoney(rest % 50);
                } else if (nextBancnote != null) {
                    System.out.println(this.amount + " x 50 ron");
                    return nextBancnote.giveMoney(rest % 50 + (amountToGive - this.amount) * 50);
                }
            }
        return nextBancnote.giveMoney(rest);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException catch");
        }
        return 0;
    }

}
