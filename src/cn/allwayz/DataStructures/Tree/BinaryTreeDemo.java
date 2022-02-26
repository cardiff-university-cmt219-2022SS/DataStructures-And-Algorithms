package cn.allwayz.DataStructures.Tree;

/**
 * 1. 创建一颗二叉树
 *
 * @author allwayz
 * @create 2022-02-16 01:41
 */
public class BinaryTreeDemo {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        // 创建节点
        Node root = new Node(1, "a");
        Node node2 = new Node(2, "b");
        Node node3 = new Node(3, "c");
        Node node4 = new Node(4, "d");
        Node node5 = new Node(5,"e");

        // 二叉树应该是递归创建
        root.setLeft(node2);
        root.setRight(node3);
        node3.setRight(node4);
        node3.setLeft(node5);

        binaryTree.setRoot(root);
        binaryTree.preOrder();
        System.out.println("=======================");
        binaryTree.inOrder();
        System.out.println("=======================");
        binaryTree.postOrder();
    }
}

class BinaryTree {
    private Node root;

    public void setRoot(Node root) {
        this.root = root;
    }

    public void preOrder() {
        if (this.root != null) {
            this.root.preOrder();
        }else {
            System.out.println("Binary Tree is Empty");
        }
    }
    public void inOrder() {
        if (this.root != null) {
            this.root.inOrder();
        }else {
            System.out.println("Binary Tree is Empty");
        }
    }
    public void postOrder() {
        if (this.root != null) {
            this.root.postOrder();
        }else {
            System.out.println("Binary Tree is Empty");
        }
    }

}

class Node {
    private int id;
    private String name;
    private Node left;
    private Node right;

    public Node(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    /**
     * 前序遍历 <br>
     * 1先输出当前点（初始的时候是root节点）<br>
     * 2如果左子节点不为空，则递归继续前序遍历 <br>
     * 2如果右子节点不为空，则递归继续前序遍历 <br>
     */
    public void preOrder() {
        System.out.println(this);
        if (this.left != null) {
            this.left.preOrder();
        }
        if (this.right != null) {
            this.right.preOrder();
        }
    }

    /**
     * 中序遍历 <br>
     * 1如果当前节点的左子节点不为空，则递归中序遍历 <br>
     * 2输出当前节点 <br>
     * 2如果当前节点的右子节点不为空，则递归中序遍历 <br>
     */
    public void inOrder() {
        if (this.left != null) {
            this.left.inOrder();
        }
        System.out.println(this);
        if (this.right != null) {
            this.right.inOrder();
        }
    }

    /**
     * 后序遍历 <br>
     * 1如果当前节点的左子节点不为空，则递归后序遍历 <br>
     * 2如果当前节点的右子节点不为空则递归后序遍历 <br>
     * 3输出当前节点 <br>
     */
    public void postOrder() {
        if (this.left != null) {
            this.left.postOrder();
        }
        if (this.right != null) {
            this.right.postOrder();
        }
        System.out.println(this);
    }


}
