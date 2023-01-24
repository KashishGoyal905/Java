import java.util.ArrayList;

public class _1_implement<K, V> {

    K key;
    V value;
    _1_implement<K, V> next;

    _1_implement(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    ArrayList<_1_implement<K, V>> bucket;
    int size;
    int bucketSize;

    _1_implement() {
        bucket = new ArrayList<>();
        size = 0;
        bucketSize = 20;
        for (int i = 0; i < 20; i++) {
            bucket.add(null);
        }
    }

    private int getIndex(K key) {
        int hashCode = key.hashCode();
        return hashCode % bucketSize;
    }

    private void rehash() {
        ArrayList<_1_implement<K, V>> temp = bucket;
        bucket = new ArrayList<>();
        bucketSize = 2 * bucketSize;
        size = 0;
        for (int i = 0; i < bucketSize; i++) {
            bucket.add(null);
        }

        for (int i = 0; i < temp.size(); i++) {
            _1_implement<K, V> head = temp.get(i);
            while (head != null) {
                K key = head.key;
                V value = head.value;
                insert(key, value);
                head = head.next;
            }
        }
    }

    public void insert(K key, V value) {
        int index = getIndex(key);
        _1_implement<K, V> head = bucket.get(index);
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        head = bucket.get(index);
        _1_implement<K, V> newNode = new _1_implement<K, V>(key, value);
        newNode.next = head;
        bucket.set(index, newNode);
        size++;
        double loadFactor = (1.0 * size) / bucketSize;
        if (loadFactor > 0.7) {
            rehash();
        }
    }

    public int size() {
        return size;
    }

    public V getValue(K key) {
        int index = getIndex(key);
        _1_implement<K, V> head = bucket.get(index);
        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public V removeValue(K key) {
        int index = getIndex(key);
        _1_implement<K, V> head = bucket.get(index);
        _1_implement<K, V> prev = null;
        while (head != null) {
            if (head.key.equals(key)) {
                if (prev == null) {
                    bucket.set(index, head.next);
                } else {
                    prev.next = head.next;
                }
                size--;
                return head.value;
            }
            prev = head;
            head = head.next;
        }
        return null;
    }

}
