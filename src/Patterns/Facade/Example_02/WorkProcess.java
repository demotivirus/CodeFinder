package Patterns.Facade.Example_02;

public class WorkProcess {
    private static Job job = new Job();
    private static BugTracker bugTracker = new BugTracker();
    private static Developer developer = new Developer();

    public static void start(){
        job.doJob();
        bugTracker.startFixBugs();
        developer.fixBugs(bugTracker);
        bugTracker.endFixBugs();
        developer.fixBugs(bugTracker);
    }
}
