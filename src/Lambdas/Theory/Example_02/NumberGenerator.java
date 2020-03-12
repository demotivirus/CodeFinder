package Lambdas.Theory.Example_02;

@FunctionalInterface
public interface NumberGenerator <T extends Number>{
    boolean cond(T arg);
}
