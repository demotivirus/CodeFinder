package Exceptions.theory;

public class Example_04 implements AutoCloseable {
    public static void main(String[] args) {
        try (Example_04 ex = new Example_04(); Example_04 e = new Example_04()){
            //Example_04 example_04 = new Example_04();
            throw new RuntimeException("Main exception");

        } catch (Exception ex){
            System.out.println(ex.getMessage());
            System.out.println(ex.toString());
            for (Throwable t : ex.getSuppressed())
                System.out.println(t.toString());
        }
    }

    @Override
    public void close() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Suppressed exception");
    }
}
