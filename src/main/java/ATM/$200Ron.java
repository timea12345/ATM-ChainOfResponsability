package ATM;

public class $200Ron extends Bancnote {

    private int amount;

    //constructor
    public $200Ron(Bancnote nextBancnote) {
        super(nextBancnote);
        this.amount = 100;
    }


    @Override
    int giveMoney(int rest) {
        int amountToGive = rest / 200;

        try {
            if (amountToGive != 0) {
                if (amountToGive <= this.amount) {
                    System.out.println(amountToGive + " x 200 ron");
                    return nextBancnote.giveMoney(rest % 200);
                } else if (nextBancnote != null) {
                    System.out.println(this.amount + " x 200 ron");
                    return nextBancnote.giveMoney(rest % 200 + (amountToGive - this.amount) * 200);
                }
            }
        return nextBancnote.giveMoney(rest);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException catch");
        }
        return 0;
    }

}
