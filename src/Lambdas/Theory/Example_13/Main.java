package Lambdas.Theory.Example_13;

public class Main {
    public static void main(String[] args) {
        String str = "My name is Jhon Dayweek";
        Double d = 3.14;
        TransformUtils<Double> dbl = new TransformUtils<>();
        dbl.transform(Math::floor, d);
        //System.out.println(doub);

        TransformUtils<String> stringTransformUtils = new TransformUtils<>();
        String s = stringTransformUtils.transform(TransformUtils::toUpCs, str);
        System.out.println(s);
    }
}
