package practice.objectequals;

public class Complex {
    private Double re, im;

    Complex(Double re, Double im) {
        this.re = re;
        this.im = im;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this){
            return true;
        }

        if(!(obj instanceof Complex))
            return false;

        Complex c = (Complex) obj;

        return Double.compare(c.im, im) == 0
                && Double.compare(c.re, re) == 0;
    }
}
