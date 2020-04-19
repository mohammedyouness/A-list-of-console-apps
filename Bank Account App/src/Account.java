package bankaccountapp;

public abstract class Account implements IBaseRate {
    // List of common properties for both Checking and Savings accounts
    private String name;
    private String sSN;
    private double balance;

    protected String accountNumber;
    protected double rate;

    static int index = 10000;

    // Constructor to set base properties and initialize the account
    public Account(String name, String sSN, double initialDeposit) {
        this.name = name;
        this.sSN = sSN;
        balance = initialDeposit;

        index++;
        // Set account number
        this.accountNumber = setAccountNumber();

        setRate();
    }

    public abstract void setRate();

    private String setAccountNumber() {
        String lastTwoOfSSN = sSN.substring(sSN.length()-2, sSN.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }
    // List of common methods
    public void compound() {
        double accruedInterest = balance * (rate/100);
        balance = balance + accruedInterest;
        System.out.println("Accrued Interest: $" + accruedInterest);
        printBalance();
    }
    public void deposit(double amountToDeposit) {
        balance = balance + amountToDeposit;
        System.out.println("Depositing $" + amountToDeposit);
        printBalance();
    }
    public void withdraw(double amountToWithdraw) {
        balance = balance - amountToWithdraw;
        System.out.println("Withdrawing $" + amountToWithdraw);
        printBalance();
    }
    public void transfer(String toWhere, double amountToTransfer) {
        balance = balance - amountToTransfer;
        System.out.println("Transferring $" + amountToTransfer + " to " + toWhere);
        printBalance();
    }
    public void printBalance() {
        System.out.println("Your balance now is: $" + balance);
    }
    public void showInfo() {
        System.out.println(
                        "NAME: " + name +
                        "\nACCOUNT NUMBER: " + accountNumber +
                        "\nBALANCE: " + balance +
                        "\nRATE: " + rate + "%"
        );
    }
}
