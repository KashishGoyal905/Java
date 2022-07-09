package _6_OOPS;

public class _1_student {
    String name;
    public int rollNumber;

    // constructor with two parameters
    public _1_student(String n, int r) {
        name = n;
        rollNumber = r;
    }

    // function
    public void print(){
        System.out.println(name + " " + rollNumber);
    }

}
