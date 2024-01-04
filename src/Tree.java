public class Tree {
    private TreeNode root;

    public Tree(){
        this.root = null;
    }

    public void addNode(int data){
        TreeNode newNode = new TreeNode(1);
        if(this.root == null){
            this.root = newNode;
        }
    }
}
