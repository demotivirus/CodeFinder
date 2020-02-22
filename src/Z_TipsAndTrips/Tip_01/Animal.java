package Z_TipsAndTrips.Tip_01;

public class Animal {
    private String name = "Animal";

    public Animal(String name) {
        System.out.println("On animal constr");
        this.name = name;
    }

    public Animal() {
    }

    protected void meth(){
        System.out.println(name);
    }

    public void setName(String name){
        System.out.println("On animal name");
        this.name = name;
    }
}
