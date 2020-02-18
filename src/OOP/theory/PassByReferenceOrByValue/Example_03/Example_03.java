package OOP.theory.PassByReferenceOrByValue.Example_03;

//Pass by reference
public class Example_03 {
    private String name;

    public String switchName(String name){
        return this.name = "default";
    }

    public Example_03(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
