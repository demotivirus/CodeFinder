package Patterns.Proxy.Example_02;

public class DBExecuterImpl implements DBExecuter{
    @Override
    public void createQuery(String query) {
        System.out.println("Execute the query " + query);
    }
}
