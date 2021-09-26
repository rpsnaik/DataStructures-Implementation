package Trees.sideViews;
import Trees.binaryTree.*;

public class rightView {
    static int maxHeight;

    public static void printRightView(Node rootNode, int currLevel){
        if(rootNode == null){
            return;
        }
        if(maxHeight < currLevel){
            System.out.print(rootNode.data+" ");
            maxHeight = currLevel;
        }
        printRightView(rootNode.right, currLevel+1);
        printRightView(rootNode.left, currLevel+1);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(6);
        tree.root.left = new Node(4);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right = new Node(8);
        tree.root.right.left = new Node(7);
        tree.root.right.right = new Node(9);

        printRightView(tree.root, 1);
    }   
}
