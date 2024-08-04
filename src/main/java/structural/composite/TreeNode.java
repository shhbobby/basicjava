package structural.composite;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class TreeNode {
    private String name;
    private TreeNode parent;
    private Vector<TreeNode> children =new Vector<>();

    public TreeNode(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public Vector<TreeNode> getChildren() {
        return children;
    }

    public void setChildren(Vector<TreeNode> children) {
        this.children = children;
    }
    public void addChild(TreeNode child) {
        children.add(child);
    }
    public void removeChild(TreeNode child) {
        children.remove(child);
    }
    public Enumeration<TreeNode> children() {
        return children.elements();
    }
}
