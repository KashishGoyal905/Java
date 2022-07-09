package _6_OOPS;

public class _2_StudentUse {
    public static void main(String[] args) {
        // if we made another constructor defalut will not work
        // _1_student s1 = new _1_student();

        _1_student s1 = new _1_student("kii", 100);
        s1.print();
        // s1.name = "kii";
        // s1.rollNumber = 100;
    }
}
