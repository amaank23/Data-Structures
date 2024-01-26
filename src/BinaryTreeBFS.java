import java.util.Queue;
import java.util.LinkedList;

public class BinaryTreeBFS {
    TreeNodeBT root;

    void breadthFirstTraversal(){
        if(root == null) return;

        Queue<TreeNodeBT> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNodeBT current = queue.poll();
            System.out.println(current.data);

            if(current.left != null){
                queue.add(current.left);
            }
            if(current.right != null){
                queue.add(current.right);
            }
        }
    }
    void dfsPreOrder(TreeNodeBT node){
        if(node == null){
            return;
        }

        System.out.println(node.data);
        dfsPreOrder(node.left);
        dfsPreOrder(node.right);
    }

    void dfsInOrder(TreeNodeBT node){
        if(node == null){
            return;
        }

        dfsInOrder(node.left);
        System.out.println(node.data);
        dfsInOrder(node.right);
    }

    void dfsPostOrder(TreeNodeBT node){
        if(node == null){
            return;
        }

        dfsPostOrder(node.left);
        dfsPostOrder(node.right);
        System.out.println(node.data);
    }
}
