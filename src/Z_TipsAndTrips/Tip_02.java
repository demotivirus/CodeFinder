package Z_TipsAndTrips;

public class Tip_02 {
    public static void main(String[] args) {
        int x = 18;
        meth(x);
        System.out.println(x);
        meth(19);
        System.out.println(x);
        final int y = x;
        meth(y);
        System.out.println(y);
        x = 20;
        System.out.println(x);
    }

    private static int meth(final int x){
        final int y = x;
        return y;
    }
}
