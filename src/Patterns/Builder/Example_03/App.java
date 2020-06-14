package Patterns.Builder.Example_03;

public class App {
    public static void main(String[] args) {
        BankAccount account = new BankAccount.Builder(134235)
                .nameOwner("Sam")
                .build();

        System.out.println(account);

        account = new BankAccount.Builder(93883322)
                .nameOwner("Adam Duglas")
                .balance(9_566_886.39d)
                .hasCredit(false)
                .rating(5.5d)
                .cityOfBank("Manhattan")
                .build();

        System.out.println(account);
    }
}
