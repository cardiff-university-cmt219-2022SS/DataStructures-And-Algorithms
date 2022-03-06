package cn.allwayz.DataStructures.Tree;

/**
 * 顺序存储二叉树，通常只考虑完全平衡二叉树
 *
 * @author allwayz
 * @create 2022-03-04 08:16
 */
public class ArrayBinaryTreeDemo {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        ArrayBinaryTree arrayBinaryTree = new ArrayBinaryTree(array);
        arrayBinaryTree.preOrder(0);
        System.out.println();
        arrayBinaryTree.inOrder(0);
        System.out.println();
        arrayBinaryTree.postOrder(0);
        System.out.println();
    }
}

class ArrayBinaryTree {
    private int[] array;

    public ArrayBinaryTree(int[] array) {
        this.array = array;
    }

    public void preOrder(int index) {
        if (array.length == 0 || array == null) {
            System.out.println("EmptyArrayException");
        }
        System.out.print(array[index]);
        if ((index * 2 + 1) < array.length) {
            preOrder(index * 2 + 1);
        }
        if ((index * 2 + 2) < array.length) {
            preOrder(index * 2 + 2);
        }
    }

    public void inOrder(int index) {
        if (array.length == 0 || array == null) {
            System.out.println("EmptyArrayException");
        }
        if ((index * 2 + 1) < array.length) {
            inOrder(index * 2 + 1);
        }
        System.out.print(array[index]);
        if ((index * 2 + 2) < array.length) {
            inOrder(index * 2 + 2);
        }
    }

    public void postOrder(int index) {
        if (array.length == 0 || array == null) {
            System.out.println("EmptyArrayException");
        }
        if ((index * 2 + 1) < array.length) {
            postOrder(index * 2 + 1);
        }
        if ((index * 2 + 2) < array.length) {
            postOrder(index * 2 + 2);
        }
        System.out.print(array[index]);
    }
}
