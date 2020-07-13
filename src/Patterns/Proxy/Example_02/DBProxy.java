package Patterns.Proxy.Example_02;

public class DBProxy implements DBExecuter{
    private boolean isAdmin;

    private DBExecuter db;

    public DBProxy(String login, String password){
        if (login == "admin" && password == "admin")
            isAdmin = true;
        db = new DBExecuterImpl();
    }

    public void createQuery(String query){
        if (isAdmin)
            db.createQuery(query);
        else {
            if (query.equalsIgnoreCase("DELETE"))
                System.out.println("Only admin allowed delete operation");
            else db.createQuery(query);
        }
    }
}
