import java.util.ArrayList;

public class TreeNode {
    public Object data;
    public ArrayList<TreeNode> branches;
    public TreeNode(Object data){
        this.data = data;
        branches = new ArrayList<TreeNode>();
    }

    public void addBranch(TreeNode node){
        branches.add(node);
    }
}
