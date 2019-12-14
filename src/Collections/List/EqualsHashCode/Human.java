package Collections.List.EqualsHashCode;

public class Human {
    private String name;
    private int money;

    public Human(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public boolean equals(Object o){
        //==
        if(this == o)
            return true;
        //null
        if(o == null)
            return false;
        //!= o.getClass()
        if(getClass() != o.getClass())
            return false;
        //cast to class
        Human human = (Human) o;
        //!= fields
        if(name != human.name)
            return false;
        if(money != human.money)
            return false;
        //true
        return true;
    }

    public int hashCode(){
        int res = getMoney();
        res = 31 * res * getName().hashCode();
        return res;
    }
}
