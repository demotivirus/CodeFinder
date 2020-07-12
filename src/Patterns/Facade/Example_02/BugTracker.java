package Patterns.Facade.Example_02;

public class BugTracker {
    private boolean isActive;

    public boolean isActive(){
        return isActive;
    }

    public void startFixBugs(){
        isActive = true;
        System.out.println("Starting fix bugs...");
    }

    public void endFixBugs(){
        isActive = false;
        System.out.println("Ending fix bugs...");
    }
}
