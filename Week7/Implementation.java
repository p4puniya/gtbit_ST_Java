package Week7;

public class Implementation {
    public static void main(String[] args) {
        BinaryTrees bt= new BinaryTrees();
        // bt.Display();
        // System.out.println(bt.treeHeight(bt.root));
        // System.out.println();
        bt.preOrder(bt.root);
        System.out.println();
        bt.inOrder(bt.root);
        System.out.println();
        bt.postOrder(bt.root);
        System.out.println();
        bt.levelOrderTraversal();
        // System.out.println(bt.findMax(bt.root));
        // System.out.println(bt.findElement(bt.root, 4));
    }
}
