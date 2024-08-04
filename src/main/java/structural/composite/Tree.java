package structural.composite;

public class Tree {
    private String name;
    private TreeNode root;

    public Tree(String name) {
        this.name = name;
        root = new TreeNode(name);
    }

    public static void main(String[] args) {
        Tree tree = new Tree("tree");
        TreeNode a = new TreeNode("a");
        TreeNode a1 = new TreeNode("a");
        TreeNode b = new TreeNode("b");
        TreeNode b1 = new TreeNode("b");
        TreeNode c = new TreeNode("c");
        TreeNode c1 = new TreeNode("c");
        TreeNode d = new TreeNode("d");
        TreeNode d1 = new TreeNode("d");
        a.addChild(b);
        a1.addChild(b1);
        tree.root.addChild(a);
        tree.root.addChild(a1);

    }
}
