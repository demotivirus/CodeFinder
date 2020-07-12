package Patterns.Proxy.Example_01;

public class RealProject implements Project{
    private String url;

    public RealProject(String url){
        this.url = url;
        load();
    }

    private void load(){
        System.out.println("Loading project from " + url);
    }

    @Override
    public void run() {
        System.out.println("Running project from " + url);
    }
}
