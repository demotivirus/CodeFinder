package Patterns.Factory.Example_02;

public class ConnectionFactory {
    public Connection getConnection(String select){
        switch (select){
            case "JDBC": return new JDBCConnection();
            case "Hibernate": return new HibernateConnection();
            default: return new JDBCConnection();
        }
    }
}
