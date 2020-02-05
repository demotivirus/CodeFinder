package Exceptions.theory.Bank;

public class BankEmployee implements BankWorker{
    @Override
    public boolean checkClientForCredit(BankClient client) throws BadCreditHistoryException, ProblemWithLawException{
        if (client.getCreditHistory().equalsIgnoreCase("bad"))
            throw new BadCreditHistoryException();
        else if (client.getCreditHistory().equalsIgnoreCase("problem with law"))
            throw new ProblemWithLawException();
        else return true;
    }
}
