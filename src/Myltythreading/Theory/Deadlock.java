package Myltythreading.Theory;

public class Deadlock {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        myThread1.setA(a);
        myThread2.setB(b);
        myThread1.start();
        myThread2.start();
    }

    static class A{
        private static B b;

        public static synchronized void getX(){
            System.out.println(b.returnX());
        }

        public static synchronized int returnX(){
            return 1;
        }
    }

    static class B{
        private static A a;

        public static synchronized void getX(){
            System.out.println(a.returnX());
        }

        public static synchronized int returnX(){
            return 1;
        }
    }

    static class MyThread1 extends Thread{
        private A a;
        public void run(){
            a.getX();
        }

        public A getA() {
            return a;
        }

        public void setA(A a) {
            this.a = a;
        }
    }

    static class MyThread2 extends Thread{
        private B b;
        public void run(){
            b.getX();
        }

        public B getB() {
            return b;
        }

        public void setB(B b) {
            this.b = b;
        }
    }
}
