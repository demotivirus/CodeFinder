package Exceptions.theory.Bank;

public class Main {
    public static void main(String[] args) {
        BankClient client1 = new BankClient("Bad");
        BankClient client2 = new BankClient("Problem with law");
        BankClient client3 = new BankClient("Good history");
        BankWorker employee = new BankEmployee();

        System.out.println(getCreditForClient(employee, client1));
        System.out.println(getCreditForClient(employee, client2));
        System.out.println(getCreditForClient(employee, client3));
    }

    public static boolean getCreditForClient(BankWorker bankWorker, BankClient bankClient){
        boolean res = false;
        try{
            if (bankWorker.checkClientForCredit(bankClient))
                return res = true;
        } catch (BadCreditHistoryException badCreditEx){
            System.out.println("Проблемы с банковской историей");
        } catch (ProblemWithLawException problemWithLaw){
            System.out.println("(((");
        }
        return res;
    }
}
