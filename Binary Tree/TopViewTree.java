import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class TopViewTree {

    // Helper class (as in your image)
    static class Info {
        Node node;
        int hd;   // horizontal distance

        Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root) {

        if (root == null) return;

        // Level order traversal
        Queue<Info> q = new LinkedList<>();

        // hd -> node
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0, max = 0;

        q.add(new Info(root, 0));

        while (!q.isEmpty()) {

            Info curr = q.remove();

            // If this horizontal distance is seen first time
            if (!map.containsKey(curr.hd)) {
                map.put(curr.hd, curr.node);
            }

            // LEFT child
            if (curr.node.left != null) {
                q.add(new Info(curr.node.left, curr.hd - 1));
                min = Math.min(min, curr.hd - 1);
            }

            // RIGHT child
            if (curr.node.right != null) {
                q.add(new Info(curr.node.right, curr.hd + 1));
                max = Math.max(max, curr.hd + 1);
            }
        }

        // Print from min HD to max HD
        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
    }

    // Main method
    public static void main(String[] args) {

        /*
                1
              /   \
             2     3
              \
               4
                \
                 5
                  \
                   6

           Top View Output: 2 1 3 6
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        topView(root);
    }
}
