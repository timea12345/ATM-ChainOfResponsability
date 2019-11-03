package ATM;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {  // todo verify infinite loop in main !!!!

    public static void main(String[] args) {

        System.out.println("Welcome to Timea's ATM!");
        System.out.println("To EXIT please press 0");
        inputAmount();

    }

    private static void inputAmount() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("How much money do you want?");
            int desiredMoney = input.nextInt();
            boolean inLoop = true;

            while (inLoop) {
                if (desiredMoney == 0) {
                    inLoop = false;
                } else {
                    while (desiredMoney % 5 != 0) {
                        System.out.println("It must be multiple for 5 Ron");
                        desiredMoney = input.nextInt();
                    }
                    delegate(desiredMoney);
                    inputAmount();
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Not an integer");
            inputAmount();
        }
    }

    private static void delegate(int desiredMoney) {
        if (desiredMoney >= 500) {
            Bancnote bancnote = new $500Ron(new $200Ron(new $100Ron(new $50Ron(new $10Ron(new $5Ron(null))))));
            bancnote.giveMoney(desiredMoney);
        } else if (desiredMoney >= 200) {
            Bancnote bancnote = new $200Ron(new $100Ron(new $50Ron(new $10Ron(new $5Ron(null)))));
            bancnote.giveMoney(desiredMoney);
        } else if (desiredMoney >= 100) {
            Bancnote bancnote = new $100Ron(new $50Ron(new $10Ron(new $5Ron(null))));
            bancnote.giveMoney(desiredMoney);
        } else if (desiredMoney >= 50) {
            Bancnote bancnote = new $50Ron(new $10Ron(new $5Ron(null)));
            bancnote.giveMoney(desiredMoney);
        } else if (desiredMoney >= 10) {
            Bancnote bancnote = new $10Ron(new $5Ron(null));
            bancnote.giveMoney(desiredMoney);
        } else {
            Bancnote bancnote = new $5Ron(null);
            bancnote.giveMoney(desiredMoney);
        }
    }

}
