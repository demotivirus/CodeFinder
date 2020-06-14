package Patterns.Builder.Example_04;

public class Account {
    private String userId;
    private String userName;

    private Account(){

    }

    public static Builder builder(){
        return new Account().new Builder();
    }

    public class Builder{
        private Account account;

        private Builder(){
            account = new Account();
        }

        public Builder userId(String userId){
            account.userId = userId;
            return this;
        }

        public Builder userName(String userName){
            account.userName = userName;
            return this;
        }

        public Account build(){
            return account;
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
