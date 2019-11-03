package ATM;

public abstract class Bancnote {

    Bancnote nextBancnote;

    //constructor
    public Bancnote(Bancnote nextBancnote) {
        this.nextBancnote = nextBancnote;
    }

    abstract int giveMoney(int rest);

}
