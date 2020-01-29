package Arrays.Practrice.CRUD;

public class Main {
    public static void main(String[] args) {
        System.out.println("===========CRUD V 1=============");
        CrudArrayV_1 crud1 = new CrudArrayV_1(10);
        crud1.add(0,8);
        crud1.add(1, 9);
        crud1.add(2, 19);
        crud1.add(4, 52);
        crud1.add(8, 16);

        //System.out.println(crud1.get(10));

        //System.out.println(crud1.delete(2));
        System.out.println(crud1.get(2));
        System.out.println(crud1.getAll());
        System.out.println(crud1.find(16));

        System.out.println("===========CRUD V 2=============");

        CrudArrayV_2 crud2 = new CrudArrayV_2(10);
        crud2.add(9);
        crud2.add(19);
        crud2.add(-4);
        crud2.delete(2);
        crud2.add(10);
        crud2.add(22);
        crud2.add(11);
        crud2.delete(1);

        System.out.println(crud2.getAll());

        crud2.deleteAll();

        System.out.println(crud2.getAll());
    }
}
