import java.util.ArrayList;

public class TreeNode {
    public int data;
    public ArrayList<TreeNode> branches;
    public TreeNode(int data){
        this.data = data;
        branches = new ArrayList<TreeNode>();
    }

    public void addBranch(TreeNode node){
        branches.add(node);
    }
}
