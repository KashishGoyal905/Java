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
        this.real = c2.real * this.real;
        this.imaginary = c2.imaginary * this.imaginary;
    }

    // public _3_complex conjugate() {
    //     if (imaginary > 0) {

    //     }else{

    //     }
    // }

}
