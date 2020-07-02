package Patterns.Composite.Example_03;

import java.util.ArrayList;
import java.util.List;

public class Expression implements SubExpression{
    private List<SubExpression> expressions;

    public Expression(SubExpression... expressions){
        this.expressions = new ArrayList<>();

        for (SubExpression sub : expressions){
            this.expressions.add(sub);
        }
    }

    @Override
    public Number value() {
        Number res = new Float(0);

        for (SubExpression ex : expressions){
            res = res.floatValue() + ex.value().floatValue();
        }

        return res;
    }

    @Override
    public void add(SubExpression ex) {
        expressions.add(ex);
    }

    @Override
    public void sub(SubExpression ex) {
        if (ex.getClass() == IntegerValue.class)
            expressions.add(new IntegerValue(-1 * ex.value().intValue()));
        else
            expressions.add(new FloatValue(-1 * ex.value().floatValue()));
    }

    @Override
    public SubExpression getSubExpression(int index) {
        return expressions.get(index);
    }
}
