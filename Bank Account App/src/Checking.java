package bankaccountapp;
public class Checking extends Account {
    // List of specific properties specific to the Checking account
    private int debitCardNumber;
    private int debitCardPIN;


    // Constructor to initialize the Checking account properties
    public Checking(String name, String sSN, double initialDeposit) {
        super(name, sSN, initialDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
    }
    @Override
    public void setRate() {
        rate = getBaseRate() * 0.15;
    }


    // List of any methods specific to the Checking account

    private void setDebitCard() {
        debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
        debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
    }

    public void showInfo() {
        super.showInfo();
        System.out.println(
                "Your Checking Account Features" +
                        "\nDebit Card Number: " + debitCardNumber +
                        "\nDebit Card PIN: " + debitCardPIN
        );
    }
}
