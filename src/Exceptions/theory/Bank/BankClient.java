package Exceptions.theory.Bank;

public class BankClient {
    private String creditHistory;

    public BankClient(String creditHistory){
        this.creditHistory = creditHistory;
    }

    public String getCreditHistory(){
        return creditHistory;
    }
}
