package _10_linkedList;

// it is a class for nodes in linked list 
public class _2_Node<T> {
    // using generics
    T data;
    _2_Node<T> next;

    _2_Node(T data) {
        this.data = data;
        next = null;
    }
}
