package Patterns.Facade.Example_02;

public class Developer {
    public void fixBugs(BugTracker bugTracker){
        if (bugTracker.isActive())
            System.out.println("Developer fixing bugs");
        else System.out.println("Developer read stackoverflow");
    }
}
