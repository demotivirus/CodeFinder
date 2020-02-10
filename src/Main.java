public class Main {
    public static void main(String[] args) {
        System.out.println(charExpression(8));
    }

    public static char charExpression(int a){
//        char slash = '\\';
//        int res = (int) slash + a;
        return (char) ('\\' + a);
    }
}
