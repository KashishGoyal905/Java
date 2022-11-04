package _10_linkedList;

import java.util.ArrayList;

public class _1_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list.size());
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(2, 50); // it will add ro at index 2 shift all by 1 to the right
        System.out.println(list.size());
        System.out.println(list.get(1));
        list.remove(1);
        list.set(1, 10);
    }
}
