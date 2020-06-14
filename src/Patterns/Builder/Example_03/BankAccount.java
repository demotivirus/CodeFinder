package Patterns.Builder.Example_03;

public class BankAccount {
    private String nameOwner;
    private double balance;
    private String cityOfBank;
    private double rating;
    private boolean hasCredit;

    private BankAccount(){}

    public static class Builder{
        private long id;
        private String nameOwner;
        private double balance;
        private String cityOfBank;
        private double rating;
        private boolean hasCredit;

        public Builder(long id){
            this.id = id;
        }

        public Builder nameOwner(String name){
            this.nameOwner = name;
            return this;
        }

        public Builder balance(double balance){
            this.balance = balance;
            return this;
        }

        public Builder cityOfBank(String cityOfBank){
            this.cityOfBank = cityOfBank;
            return this;
        }

        public Builder rating(double rating){
            this.rating = rating;
            return this;
        }

        public Builder hasCredit(boolean hasCredit){
            this.hasCredit = hasCredit;
            return this;
        }

        public BankAccount build(){
            BankAccount account = new BankAccount();
            account.nameOwner = this.nameOwner;
            account.balance = this.balance;
            account.cityOfBank = this.cityOfBank;
            account.hasCredit = this.hasCredit;
            account.rating = this.rating;

            return account;
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "nameOwner='" + nameOwner + '\'' +
                ", balance=" + balance +
                ", cityOfBank='" + cityOfBank + '\'' +
                ", rating=" + rating +
                ", hasCredit=" + hasCredit +
                '}';
    }
}
