package IO_NIO.Theory.Externalizable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Base64;

public class User implements Externalizable {
    private String name;
    private String password;

    public User(){}

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    private String encryptString(String str){
        String encrypt = Base64.getEncoder().encodeToString(str.getBytes());
        System.out.println(encrypt);
        return encrypt;
    }

    private String decryptString(String str){
        String gecrypt = new String(Base64.getDecoder().decode(str));
        System.out.println(gecrypt);
        return gecrypt;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeObject(encryptString(password));
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        password = decryptString((String) in.readObject());
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
