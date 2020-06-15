package Patterns.Builder.Example_05;

public class Human {
    private String name;
    private String address;
    private Integer age;
    private Integer money;
    private String surname;
    private String telNumber;
    private Integer health;

    private Human(){}

    public static class Builder{
        private Human human;

        public Builder(){
            human = new Human();
        }

        public Builder name(String name){
            human.name = name;
            return this;
        }

        public Builder address(String address){
            human.address = address;
            return this;
        }

        public Builder age(Integer age){
            human.age = age;
            return this;
        }

        public Builder money(Integer money){
            human.money = money;
            return this;
        }

        public Builder surname(String surname){
            human.surname = surname;
            return this;
        }

        public Builder telNumber(String telNumber){
            human.telNumber = telNumber;
            return this;
        }

        public Builder health(Integer health){
            human.health = health;
            return this;
        }

        public Human build(){
            return human;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Human{");
        if (name != null)
            sb.append("name='" + name + '\'');
        if (address != null)
            sb.append(" address='" + address + '\'');
        if (age != null)
            sb.append(" age=" + age);
        if(money != null)
            sb.append(" money=" + money );
        if (surname != null)
            sb.append(" surname='" + surname + '\'');
        if (telNumber != null)
            sb.append(" telNumber='" + telNumber + '\'');
        if (health != null)
            sb.append(" health=" + health);
        sb.append('}');
        return sb.toString();
    }
}
