package Mine.Inheritance;

public abstract class Bank {

    void bankName() {
    }

    void rules() {
        System.out.println("you can deposit and credit in your account ");
    }

}

class Sbi extends Bank {

    @Override
    void bankName() {
        System.out.println("Your bank name is Sbi");
    }
}

class Boi extends Bank {

    @Override
    void bankName() {
        System.out.println("Your bank name is Boi");
    }
}

class BankMain {
    public static void main(String[] args) {

        Bank sbi = new Sbi();
        sbi.bankName();
        sbi.rules();

        Bank boi = new Boi();
        boi.bankName();
        boi.rules();


    }
}


