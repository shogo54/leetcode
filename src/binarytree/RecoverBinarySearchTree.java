
public class RecoverBinarySearchTree{

List<TreeNode> list;
    
    public void recoverTree(TreeNode root) {
        list = new ArrayList<TreeNode>();
        TreeNode s1 = null;
        TreeNode s2 = null;
        
        inorder(root);
        
        for(int i=0; i<list.size()-1; i++){
            if(list.get(i).val > list.get(i+1).val){
                if(s1 == null){
                    s1 = list.get(i);
                    s2 = list.get(i+1);
                }else{
                    s2 = list.get(i+1);
                    break;
                }
            }
        }
        
        if(s1 != null){
            int temp = s1.val;
            s1.val = s2.val;
            s2.val = temp;
        }
    }
    
    private void inorder(TreeNode root){
        if(root != null){
            inorder(root.left);
            list.add(root);
            inorder(root.right);
        }
    }

}
