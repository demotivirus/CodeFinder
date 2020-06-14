package Patterns.Builder.Example_04;

public class App {
    public static void main(String[] args) {
        Account account = Account.builder()
                .userId("830022")
                .userName("Rahim")
                .build();

        System.out.println(account);
    }
}
