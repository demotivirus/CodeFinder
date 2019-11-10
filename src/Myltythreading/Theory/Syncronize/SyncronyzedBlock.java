package Myltythreading.Theory.Syncronize;

public class SyncronyzedBlock {
    public static void main(String[] args) throws InterruptedException{
        Demo demo = new Demo();
        Mythread mythread1 = new Mythread();
        Mythread mythread2 = new Mythread();
        mythread1.setDemo(demo);
        mythread2.setDemo(demo);
        mythread2.join();
        mythread1.join();
        System.out.println(demo.getI() + " non synchronized thread");
        System.out.println(demo.getJ() + " on synchronized thread");
    }

    static class Mythread extends Thread{
        private Demo demo;

        public void setDemo(Demo demo) {
            this.demo = demo;
            start();
        }

        public void run(){
            for (int i = 0; i < 1_000_000; i++) {
                demo.synch();
                demo.nonSynch();
            }
        }
    }

    static class Demo{
        private int i;
        private int j;

        public void nonSynch(){
            i++;
        }

        public synchronized void synch(){
            j++;
        }

        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }
    }
}
