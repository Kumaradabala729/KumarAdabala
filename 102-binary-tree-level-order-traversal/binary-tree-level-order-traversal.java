class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        traverse(root, 0);
        return res;
    }
    public void traverse(TreeNode root, int level){
        if (root == null){
            return;
        }
        if (res.size() <= level){
            res.add(new ArrayList<>());
        }
        res.get(level).add(root.val); 
        traverse(root.left, level+1);
        traverse(root.right, level+1);
    }
}