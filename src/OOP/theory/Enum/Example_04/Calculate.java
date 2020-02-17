package OOP.theory.Enum.Example_04;

public enum Calculate {
    SUM{
        public int action(int x, int y){return x + y;}
        },
    SUB{
        public int action(int x, int y){return x - y;}
    },
    MULT{
        public int action(int x, int y){return x * y;}
    },
    DIV{
        public int action(int x, int y){return x / y;}
    };

    public abstract int action(int x, int y);
}
