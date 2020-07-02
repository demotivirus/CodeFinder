package Patterns.Composite.Example_03;

public interface SubExpression {
    Number value();

    void add(SubExpression ex);
    void sub(SubExpression ex);

    SubExpression getSubExpression(int index);
}
