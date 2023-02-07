package Models;

public class ATM {
    private int savingsAccountNumber;
    private int checkingAccountNumber;
    private int savingsAccountBal;
    private int checkingAccountBal;

    public int getSavingsAccountNumber() {
        return savingsAccountNumber;
    }

    public void setSavingsAccountNumber(int savingsAccountNumber) {
        this.savingsAccountNumber = savingsAccountNumber;
    }

    public int getCheckingAccountNumber() {
        return checkingAccountNumber;
    }

    public void setCheckingAccountNumber(int checkingAccountNumber) {
        this.checkingAccountNumber = checkingAccountNumber;
    }

    public int getSavingsAccountBal() {
        return savingsAccountBal;
    }

    public void setSavingsAccountBal(int savingsAccountBal) {
        this.savingsAccountBal = savingsAccountBal;
    }

    public int getCheckingAccountBal() {
        return checkingAccountBal;
    }

    public void setCheckingAccountBal(int checkingAccountBal) {
        this.checkingAccountBal = checkingAccountBal;
    }
}
