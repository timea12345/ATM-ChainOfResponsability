package ATM;

public class $10Ron extends Bancnote {

    private int amount;

    //constructor
    public $10Ron(Bancnote nextBancnote) {
        super(nextBancnote);
        this.amount = 20;
    }


    @Override
    int giveMoney(int rest) {
        int amountToGive = rest / 10;

        try {
            if (amountToGive != 0) {
                if (amountToGive <= this.amount) {
                    System.out.println(amountToGive + " x 10 ron");
                    return nextBancnote.giveMoney(rest % 10);
                } else if (nextBancnote != null) {
                    System.out.println(this.amount + " x 10 ron");
                    return nextBancnote.giveMoney(rest % 10 + (amountToGive - this.amount) * 10);
                }
            }
        return nextBancnote.giveMoney(rest);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException catch");
        }
        return 0;
    }

}
