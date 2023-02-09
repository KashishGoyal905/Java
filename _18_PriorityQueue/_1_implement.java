import java.util.ArrayList;

public class _1_implement {
    ArrayList<Integer> heap;

    _1_implement() {
        heap = new ArrayList<Integer>();
    }

    // isempty
    boolean isEmpty() {
        if (heap.size() == 0) {
            return true;
        }
        return false;   
    }

    // size
    int size() {
        return heap.size();
    }

    // get min
    int getMin() {
        if (isEmpty()) {
            System.out.println("empty priority queue");
            return -1;
        }
        return heap.get(0);
    }

    // inserting
    void insert(int element) {
        // adding the element
        heap.add(element);
        // up heapify
        int childIndex = heap.size() - 1;
        int parentIndex = (childIndex - 1) / 2;
        while (childIndex > 0) {
            if (heap.get(childIndex) < heap.get(parentIndex)) {
                int temp = heap.get(childIndex);
                heap.set(childIndex, heap.get(parentIndex));
                heap.set(parentIndex, temp);
                childIndex = parentIndex;
                parentIndex = (childIndex - 1) / 2;
            } else {
                return;
            }
        }
    }

    // deleting
    int removeMin() {
        if (isEmpty()) {
            System.out.println("empty priority queue");
            return -1;
        }
        int temp = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);
        // ! down heapify
        // root index
        int index = 0;
        // index of min value default: 0
        int minIndex = index;
        int leftChildIndex = 1;
        int rightChildIndex = 2;

        while (leftChildIndex < heap.size()) {
            // finding the least value from the root, leftChild and the rightChild
            if (heap.get(leftChildIndex) < heap.get(minIndex)) {
                minIndex = leftChildIndex;
            }
            if (rightChildIndex < heap.size() && heap.get(rightChildIndex) < heap.get(minIndex)) {
                minIndex = rightChildIndex;
            }
            if (minIndex == index) {
                break;
            } else {
                // swapping
                int temp1 = heap.get(index);
                heap.set(index, heap.get(minIndex));
                heap.set(minIndex, temp1);
                // updating
                index = minIndex;
                leftChildIndex = index * 2 + 1;
                rightChildIndex = index * 2 + 2;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        
    }
}
