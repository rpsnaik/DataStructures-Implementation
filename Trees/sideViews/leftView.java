package Trees.sideViews;
import Trees.binaryTree.*;

public class leftView {
    static int maxHeight = 0;


    public static void printLeftView(Node rootNode, int currLevel){
        if(rootNode == null){
            return;
        }
        if(maxHeight < currLevel){
            maxHeight = currLevel;
            System.out.print(rootNode.data+" ");
        }
        printLeftView(rootNode.left, currLevel+1);
        printLeftView(rootNode.right, currLevel+1);
        
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

        printLeftView(tree.root, 1);
        
    }
}


        //      6
        //    /   \
        //   4     8
        //  / \   / \
        // 3   5  7  9