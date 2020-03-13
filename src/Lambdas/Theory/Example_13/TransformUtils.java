package Lambdas.Theory.Example_13;

public class TransformUtils<T> {
    T transform(Transformable<T> tTransformable, T t){
        return tTransformable.transform(t);
    }

    public static String toUpCs(String str){
        return str.toUpperCase();
    }
}
