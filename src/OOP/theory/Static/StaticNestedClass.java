package OOP.theory.Static;

public class StaticNestedClass {
    int z = 16;

    NestedClass nestedClass = new NestedClass();

    static class NestedClass{
        int x = 8;
        StaticNestedClass staticNestedClass = new StaticNestedClass();

        public int getX() {
            return x;
        }
    }

    public  int getZ() {
        return z;
    }
}
