
public class Main {
    public static void main(String[] args) {
        BinaryTreeBFS tree = new BinaryTreeBFS();
        tree.root = new TreeNodeBT(10);
        tree.root.left = new TreeNodeBT(5);
        tree.root.right = new TreeNodeBT(15);
        tree.root.left.left = new TreeNodeBT(2);
        tree.root.left.right = new TreeNodeBT(8);
        tree.root.right.left = new TreeNodeBT(12);
        tree.root.right.right = new TreeNodeBT(20);

        System.out.println("DFS PRE ORDER Traversal of Binary Tree:");
        tree.dfsPreOrder(tree.root);

        System.out.println("DFS In ORDER Traversal of Binary Tree:");
        tree.dfsInOrder(tree.root);

        System.out.println("DFS POST ORDER Traversal of Binary Tree:");
        tree.dfsPostOrder(tree.root);
    }

}