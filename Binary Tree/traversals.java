import java.util.*;

class traversals {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static void levelOrderTraversal(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node curNode = q.remove();
            if (curNode == null) {
                System.out.println(); // new line after each level
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(curNode.data + " ");
                if (curNode.left != null) {
                    q.add(curNode.left);
                }
                if (curNode.right != null) {
                    q.add(curNode.right);
                }
            }
        }
    }

    public static int Height(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = Height(root.left);
        int rightHeight = Height(root.right);

        int height = Math.max(leftHeight,rightHeight) + 1;

        return height;
    }

    public static int Count(Node root){
        if(root == null){
            return 0;
        }
        int leftCount = Count(root.left);
        int rightcount = Count(root.right);

        int treeCount = leftCount + rightcount + 1;

        return treeCount;
    }

    public static int nodeSum(Node root){
        if(root == null){
            return 0;
        }
        int leftSum = nodeSum(root.left);
        int rightSum = nodeSum(root.right);

        int treeSum = leftSum + rightSum + root.data;

        return treeSum;
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();

        Node root = tree.buildTree(nodes);
        System.out.println("Root node: " + root.data);

        System.out.println("Level Order Traversal:");
        levelOrderTraversal(root);

        System.out.println("Height of Tree: "+Height(root));

        System.out.println("Total node in tree: "+Count(root));

        System.out.print("Sum of nodes: "+nodeSum(root));
        
    }
}
