package bankaccountapp;

public class Savings extends Account {
    // List of specific properties specific to the Savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    // Constructor to initialize the Savings account properties
    public Savings(String name, String sSN, double initialDeposit) {
        super(name, sSN, initialDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }
    @Override
    public void setRate() {
        rate = getBaseRate() - 0.25;
    }

    // List of any methods specific to the Savings account
    private void setSafetyDepositBox() {
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }

    public void showInfo() {
        super.showInfo();
        System.out.println(
            "Your Savings Account Features" +
             "\nSafety Deposit Box ID: " + safetyDepositBoxID +
             "\nSafety Deposit Box Key: " + safetyDepositBoxKey
        );
    }
}
