package Patterns.Proxy.Example_01;

public class Main {
    public static void main(String[] args) {
        RealProject project = new RealProject("https://www.github.com/real/project");
        //project.run();
        System.out.println("//////////////////////////");
        project.run();
        System.out.println("==========================");

        ProxyProject proxy = new ProxyProject("https://www.github.com/all/github");
        System.out.println("NOTHING");
        System.out.println("==========================");

        proxy.run();
    }
}
