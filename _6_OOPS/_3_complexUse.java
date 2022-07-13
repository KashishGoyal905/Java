package _6_OOPS;

public class _3_complexUse {
    public static void main(String[] args) {
        _3_complex c1 = new _3_complex(2, 3);
        c1.print();

        c1.setReal(10);
        c1.setImaginary(30);
        c1.print();

        _3_complex c2 = new _3_complex(1, 5);
        c2.print();
        c1.add(c2);
        c1.print();

        c1.multiply(c2);
        c1.print();
        
        _3_complex c3 = _3_complex.add(c1,c2);
        c1.print();
        c2.print();
        c3.print();


        // _3_complex c4 = c1.conjugate();
        // c4.print();

        

    }

}
