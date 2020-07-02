package Patterns.Composite.Example_03;

public class Main {
    public static void main(String[] args) {
        //20 - (5-2) - (11+6) + 10
        //20 - a - b

        SubExpression ex = new Expression();

        SubExpression a = new Expression(new IntegerValue(5), new IntegerValue(-2));
        SubExpression b = new Expression(new IntegerValue(11), new IntegerValue(6));

        ex.add(new IntegerValue(20));
        ex.sub(a);
        ex.sub(b);
        ex.sub(new IntegerValue(-10));

        System.out.println(ex.value());
    }
}
