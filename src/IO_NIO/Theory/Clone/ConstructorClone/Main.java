package IO_NIO.Theory.Clone.ConstructorClone;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        //Car car = new Car("Honda");

        Human bill = new Human("Bill", (byte) 42, "Honda");

        Human cloneBill = (Human) bill.clone();

        System.out.println(bill);
        System.out.println(cloneBill);

        cloneBill.setAge((byte) 52);
        //cloneBill.setCar(new Car("Jeep"));
        cloneBill.setCar("Jeep");

        System.out.println(bill);
        System.out.println(cloneBill);
    }
}
