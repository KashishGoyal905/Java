package _19_Tries;

public class _1_tries {
    char data;
    boolean eow;
    _1_tries[] children;

    _1_tries(char data) {
        this.data = data;
        eow = false;
        children = new _1_tries[26];
    }

    public static void insert(_1_tries root, String word) {
        if (word.length() == 0) {
            root.eow = true;
            return;
        }

        int childIndex = word.charAt(0) - 'a';
        _1_tries child = root.children[childIndex];

        if (child == null) {
            child = new _1_tries(word.charAt(0));
            root.children[childIndex] = child;
        }

        insert(child, word.substring(1));
    }

    public static boolean search(_1_tries root, String word) {
        if (word.length() == 0) {
            return root.eow;
        }

        int childIndex = word.charAt(0) - 'a';
        _1_tries child = root.children[childIndex];
        if (child == null) {
            return false;
        }

        return search(child, word.substring(1));
    }

    public static void main(String[] args) {
        _1_tries root = new _1_tries('\0');
        String word = "note";
        insert(root, word);
        System.out.print(search(root, "note"));
    }
}
