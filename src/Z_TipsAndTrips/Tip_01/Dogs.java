package Z_TipsAndTrips.Tip_01;

public class Dogs extends Animal {
    private String name;

    Dogs(String name){
        super(name);
        System.out.println("On dogs constr");
    }

    @Override
    public void setName(String name){
        System.out.println("On dogs name");
    }
}
