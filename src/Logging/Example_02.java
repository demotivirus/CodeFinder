package Logging;

public class Example_02 {
    public static void main(String[] args) {
        //System.out.println(getCallerClassAndMethodName());
        m1();    }

    static void m1() {
        System.out.println(getCallerClassAndMethodName());
        m2();    }

    static void m2() {
        System.out.println(getCallerClassAndMethodName());
        m3();    }

    static void m3() {
        System.out.println(getCallerClassAndMethodName());    }

    public static String getCallerClassAndMethodName() {
        //0 - getStackTrace
        //
        //1 - имя метода (свое имя)
        //
        //2 - имя метода кто вызвал [1]
        //
        //3 - имя метода кто вызвал [2]
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        if(stackTrace.length < 3)
            return null;
        else return stackTrace[2].getClassName() + "#" + stackTrace[2].getMethodName();
    }
}
