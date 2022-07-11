package _6_OOPS;

// student class
public class _1_student {
    String name;
    // final data members can be initialized as soon as they are declared
    public final int rollNumber;
    // creating a single varible for all the objects
    private static int numStudents;

    // constructor with two parameters
    public _1_student(String name, int rollNumber) {
        // inside this function name and rollNumber are local so need to acees upper
        // name and roll number we need `this`
        // this is what object on which constructor is called like here s1 or s2
        this.name = name;
        this.rollNumber = rollNumber;
        numStudents++;
    }

    // getting no. of students
    // static as it doesm't matter on obj name but class name
    public static int getNumStudents() {
        return numStudents;
    }

    // function
    public void print() {
        System.out.println(name + " " + rollNumber);
    }

}
