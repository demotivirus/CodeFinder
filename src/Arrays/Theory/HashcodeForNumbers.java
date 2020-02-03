package Arrays.Theory;

public class HashcodeForNumbers {
    private double re;
    private double im;

    public HashcodeForNumbers(){}

    public HashcodeForNumbers(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null)
            return false;
        if (obj == this)
            return true;
        if (getClass() != obj.getClass())
            return false;
        HashcodeForNumbers complexNumber = (HashcodeForNumbers) obj;
        return Double.compare(complexNumber.re, re) == 0 &&
                Double.compare(complexNumber.im, im) == 0;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + Double.valueOf(re).hashCode();
        result = 31 * result + Double.valueOf(im).hashCode();
        return result;
    }

    public static void main(String[] args) {
        HashcodeForNumbers hashcode = new HashcodeForNumbers(1, 1);
        HashcodeForNumbers hashcode2 = new HashcodeForNumbers(1, 1);

        System.out.println(hashcode.equals(hashcode2));
    }
}
