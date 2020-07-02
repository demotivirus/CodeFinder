package Patterns.Brige.Example_02;

public class InternetShop extends Program{
    protected InternetShop(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Internet shop development in progress...");
        developer.writeCode();
    }
}
