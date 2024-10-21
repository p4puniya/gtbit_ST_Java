package Week7;
import java.util.Scanner;
public class BinaryTrees {
    class Node{
        int val;
        Node left;
        Node right;
    }

    Node root;

    Scanner sc= new Scanner(System.in);
    public BinaryTrees(){
        root= CreateTree();
    }

    public Node CreateTree(){
        System.out.println("Give value");
        int item= sc.nextInt();
        Node nn= new Node();
        nn.val= item;
        System.out.println("Has Left Child");
        boolean hlc= sc.nextBoolean();
        if(hlc)
            nn.left= CreateTree();
        System.out.println("Has Right Child");
        boolean hrc= sc.nextBoolean();
        if(hrc)
            nn.right= CreateTree();
        return nn;
    }

    public void Display(){
        Display(root);
    }

    public void Display(Node nn){
        if(nn== null) return;
        String s= "";
        s= "<--"+nn.val+"-->";
        if(nn.left!= null)
            s= nn.left.val+s;
        else
            s= "Null "+s;
        
        if(nn.right!= null)
            s+= nn.right.val;
        else
            s+= " Null";
        System.out.println(s);
        Display(nn.left);
        Display(nn.right);
    }

    public int findMax(Node node){
        if(node==null)
            return Integer.MIN_VALUE;

        int lmax= findMax(node.left);
        int rmax= findMax(node.right);

        return Math.max(node.val, Math.max(lmax, rmax));
    }

    public boolean findElement(Node nn, int num){
        if(nn==null)
            return false;
        if(nn.val==num)
            return true;
        
        boolean left= findElement(nn.left, num);
        boolean right= findElement(nn.right, num);
        return (left||right);
    }

    public int treeHeight(Node nn){
        if(nn==null) return 0;

        int leftTree= treeHeight(nn.left);
        int rightTree= treeHeight(nn.right);

        return 1+Math.max(leftTree, rightTree);
    }

    public void inOrder(Node nn){
        if(nn==null) return;

        inOrder(nn.left);
        System.out.print(nn.val+" ");
        inOrder(nn.right);
    }

    public void preOrder(Node nn){
        if(nn==null) return;
        System.out.print(nn.val+" ");
        preOrder(nn.left);
        preOrder(nn.right);
    }

    public void postOrder(Node nn){
        if(nn==null) return;
        postOrder(nn.left);
        postOrder(nn.right);
        System.out.print(nn.val+" ");
    }
}
