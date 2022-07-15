package _6_OOPS;

public class _3_complex {
    private int real;
    private int imaginary;

    public _3_complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void print() {
        if (this.imaginary < 0) {
            System.out.println(real + " - " + Math.abs(imaginary) + "i");
        } else {
            System.out.println(real + " + " + imaginary + "i");
        }
    }

    public int getReal() {
        return real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public void add(_3_complex c2) {
        this.real = c2.real + this.real;
        this.imaginary = c2.imaginary + this.imaginary;
    }

    public void multiply(_3_complex c2) {
        this.real = (c2.real * this.real) - (this.imaginary * c2.imaginary);
        this.imaginary =(this.real * c2.imaginary) + (this.imaginary * c2.real);
    }

    public static _3_complex add(_3_complex c2, _3_complex c3) {
        int newReal = c2.real + c3.real;
        int newimaginary = c2.imaginary + c3.imaginary;
        _3_complex c = new _3_complex(newReal, newimaginary);
        return c;
    }

    // public _3_complex conjugate(){

    // }

}
// strings strings function user defined function
