package Patterns.Composite.Example_03;

public class FloatValue implements SubExpression {
    private Float value;

    public FloatValue(Float value){
        this.value = value;
    }

    @Override
    public Number value() {
        return value;
    }

    @Override
    public void add(SubExpression ex) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void sub(SubExpression ex) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SubExpression getSubExpression(int index) {
        throw new UnsupportedOperationException();
    }
}
