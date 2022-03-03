package cn.allwayz.DataStructures.Tree;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

/**
 * 树存储方式的分析
 * 能提高数据存储，读取的效率，比如利用二叉树，既可以保证数据的检索速度，同时也可以保证数据的插入，删除修改速度
 * <p>
 * 1. 创建一颗二叉树
 *
 * @author allwayz
 * @create 2022-02-16 01:41
 */
public class BinaryTreeDemo {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        System.out.println("put <root_node_id> | put <left> <root_node_id> <leaf_id>");
        System.out.println("search <node_id>");
        System.out.println("show");
        System.out.println("quit/exit");
        String[] key;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            key = scanner.nextLine().split(" ");
            switch (key[0]) {
                case "put":
                    if (binaryTree.isEmpty()) {
                        Node temp = new Node(Integer.parseInt(key[1]), key[1]);
                        binaryTree.setRoot(temp);
                    } else {
                        int root = Integer.parseInt(key[2]);
                        Node temp = new Node(Integer.parseInt(key[3]), key[3]);
                        if (Objects.equals(key[1], "left")) {
                            System.out.println("left");
                            binaryTree.preOrderSearch(root).setLeft(temp);
                        } else if (Objects.equals(key[1], "right")) {
                            System.out.println("right");
                            binaryTree.preOrderSearch(root).setRight(temp);
                        }
                    }
                    break;
                case "search":
                    int id = Integer.parseInt(key[2]);
                    binaryTree.preOrderSearch(id);
                    break;
                case "delete":
                    binaryTree.delete(Integer.parseInt(key[1]));
                    break;
                case "show":
                    binaryTree.displayTree();
                    break;
                case "quit":
                case "exit":
                    System.exit(1);
                    break;
                default:
                    break;
            }
        }
    }
}

class BinaryTree {
    private Node root;

    public void setRoot(Node root) {
        this.root = root;
    }

    /**
     * 可视化打印树结构
     */
    public void displayTree() {
        Stack<Node> globalStack = new Stack<>();
        globalStack.push(root);
        int nBlank = 32;
        boolean isRowEmpty = false;
        String dot = "............................";
        System.out.println(dot + dot + dot);
        while (isRowEmpty == false) {
            Stack<Node> localStack = new Stack<>();
            isRowEmpty = true;
            for (int j = 0; j < nBlank; j++) {
                System.out.print("-");
            }
            while (!globalStack.isEmpty()) {
                //里面的while循环用于查看全局的栈是否为空
                Node temp = globalStack.pop();
                if (temp != null) {
                    System.out.print(temp.getId());
                    localStack.push(temp.getLeft());
                    localStack.push(temp.getRight());
                    //如果当前的节点下面还有子节点，则必须要进行下一层的循环
                    if (temp.getLeft() != null || temp.getRight() != null) {
                        isRowEmpty = false;

                    }
                } else {
                    //如果全局的栈则不为空
                    System.out.print("#!");
                    localStack.push(null);
                    localStack.push(null);
                }
                //打印一些空格
                for (int j = 0; j < nBlank * 2 - 2; j++) {
                    //System.out.print("&");
                    System.out.print(" ");
                }
            }//while end


            System.out.println();
            nBlank /= 2;
            //这个while循环用来判断，local栈是否为空,不为空的话，则取出来放入全局栈中
            while (!localStack.isEmpty()) {
                globalStack.push(localStack.pop());
            }
        }//大while循环结束之后，输出换行
        System.out.println(dot + dot + dot);
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    public void preOrder() {
        if (this.root != null) {
            this.root.preOrder();
        } else {
            System.out.println("Binary Tree is Empty");
        }
    }

    public void inOrder() {
        if (this.root != null) {
            this.root.inOrder();
        } else {
            System.out.println("Binary Tree is Empty");
        }
    }

    public void postOrder() {
        if (this.root != null) {
            this.root.postOrder();
        } else {
            System.out.println("Binary Tree is Empty");
        }
    }

    public Node preOrderSearch(int id) {
        if (this.root != null) {
            Node temp = this.root.preOrderSearch(id);
            if (temp != null) {
                return temp;
            } else {
                System.out.println("NodeNotFoundExecution");
            }
        } else {
            System.out.println("Binary Tree is Empty");
        }
        return null;
    }

    public void inOrderSearch(int id) {
        if (this.root != null) {
            Node temp = this.root.inOrderSearch(id);
            if (temp != null) {
                System.out.println(temp);
            } else {
                System.out.println("NodeNotFoundExecution");
            }
        } else {
            System.out.println("Binary Tree is Empty");
        }
    }

    public void postOrderSearch(int id) {
        if (this.root != null) {
            Node temp = this.root.postOrderSearch(id);
            if (temp != null) {
                System.out.println(temp);
            } else {
                System.out.println("NodeNotFoundExecution");
            }
        } else {
            System.out.println("Binary Tree is Empty");
        }
    }

    /**
     * 删除结点
     *
     * @param id
     */
    public void delete(int id) {
        if (root != null) {
            if (root.getId() == id) {
                root = null;
            } else {
                root.deleteNode(id);
            }
        } else {
            System.out.println("EmptyTreeException");
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

    /**
     * 前序遍历查找
     *
     * @param id
     * @return
     */
    public Node preOrderSearch(int id) {
        if (this.id == id) {
            return this;
        }
        Node resNode = null;
        if (this.left != null) {
            resNode = this.left.preOrderSearch(id);
        }
        if (resNode != null) {
            return resNode;
        }
        if (this.right != null) {
            resNode = this.right.preOrderSearch(id);
        }
        return resNode;
    }

    /**
     * 中序遍历查找
     *
     * @param id
     * @return
     */
    public Node inOrderSearch(int id) {
        Node resNode = null;
        if (this.left != null) {
            resNode = this.left.inOrderSearch(id);
        }
        if (this.id == id) {
            return this;
        }
        if (this.right != null) {
            resNode = this.right.inOrderSearch(id);
        }
        return resNode;
    }

    /**
     * 后序遍历查找
     *
     * @param id
     * @return
     */
    public Node postOrderSearch(int id) {
        Node resNode = null;
        if (this.left != null) {
            resNode = this.left.postOrderSearch(id);
        }
        if (this.right != null) {
            resNode = this.right.postOrderSearch(id);
        }
        if (this.id == id) {
            return this;
        }
        return resNode;
    }

    /**
     * 如果是叶子结点，则删除该结点<br>
     * 如果删除的结点是非叶子结点，则删除改子树<br>
     * <p>
     * 1）考虑如果是空树，如果只有一个root结点，则就是将二叉树置空<br>
     * 2）因为二叉树是单向的，所以判断当前结点的子结点是否为待删除结点，而不能直接判断当前结点是否为待删除结点<br>
     * 3）如果当前结点的左子结点不为空，并且左子结点就是要删除的结点，直接this.left = null;，然后结束递归<br>
     * 4）如果当前结点的右子结点不为空，并且右子结点就是要删除的结点，直接this.right = null;，然后结束递归<br>
     * 5）如果前两步都没有删除，需要向左子树进行递归删除<br>
     * 6）如果第四步也没有删除结点，则应当向右子树进行递归删除<br>
     *
     * @param id
     */
    public void deleteNode(int id) {
        if (this.left != null && this.left.id == id) {
            this.left = null;
            return;
        }
        if (this.right != null && this.right.id == id) {
            this.right = null;
            return;
        }
        if (this.left != null) {
            this.left.deleteNode(id);
        }
        if (this.right != null) {
            this.right.deleteNode(id);
        }
    }

}
