package Trie.WordsBreakProblem;

public class wordsBreak {
    static class Node {
        Node child[] = new Node[26];
        boolean eow = false;

        Node() {
            for (int i = 0; i < 26; i++) {
                child[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';

            if (curr.child[idx] == null) {
                curr.child[idx] = new Node();
            }
            curr = curr.child[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String key) {
        Node curr = root;
        for (int level = 0; level < key.length(); level++) {
            int idx = key.charAt(level) - 'a';

            if (curr.child[idx] == null) {
                return false;
            }
            curr = curr.child[idx];
        }
        return curr.eow == true;
    }

    public static boolean wordsBreak(String key) {
        if (key.length() == 0) {
            return true;
        }
        for (int i = 1; i <= key.length(); i++) {
            if (search(key.substring(0, i)) &&
                    wordsBreak(key.substring(i))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String words[] = { "i", "like", "sam", "samsung", "ice", "mobile" };

        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        String key = "ilikesung";

        System.out.println(wordsBreak(key));
    }
}
