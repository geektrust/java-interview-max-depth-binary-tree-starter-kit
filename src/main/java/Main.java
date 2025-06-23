public class Main {
    /* Implement your solution inside this method. */
    public static int maxDepth(TreeNode root) {
        return -1;
    }
    
     /*
     * *****************************************************************************
     * DO NOT EDIT THIS CODE.
     * *****************************************************************************
     * 
     * This code is used to bootstrap your solution to be checked for correctness by
     * our system.
     */
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Usage: java Main \"[3,5,1,6,2,0,8,null,null,7,4]\"");
            return;
        }

        String treeListStr = args[0];

        Integer[] treeValues = TreeUtils.parseInputArray(treeListStr);
        TreeNode root = TreeUtils.buildTree(treeValues);

        System.out.println(maxDepth(root));
    }
}
