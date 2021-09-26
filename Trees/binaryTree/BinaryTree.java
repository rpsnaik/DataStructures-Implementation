package Trees.binaryTree;


public class BinaryTree {
    public Node root;

    public void inorder(Node rootNode){
        if(rootNode.left != null){
            inorder(rootNode.left);
        }
        System.out.print(rootNode.data+" ");
        if(rootNode.right != null){
            inorder(rootNode.right);
        }
    }

    public void preorder(Node rootNode){
        System.out.print(rootNode.data+" ");
        if(rootNode.left != null){
            preorder(rootNode.left);
        }
        
        if(rootNode.right != null){
            preorder(rootNode.right);
        }
    }

    public void postorder(Node rootNode){
        if(rootNode.left != null){
            postorder(rootNode.left);
        }
        
        if(rootNode.right != null){
            postorder(rootNode.right);
        }
        System.out.print(rootNode.data+" ");
    }

    public int heightOfTree(Node rootNode){
        if(rootNode == null){
            return 0;
        }
        else{
            int lheight = heightOfTree(rootNode.left);
            int rheight = heightOfTree(rootNode.right);

            if(lheight > rheight){
                return lheight+1;
            }else{
                return rheight+1;
            }
        }
    }

    private void levelOrder(Node rootNode, int level){
        if(rootNode == null){
            return;
        }
        if(level == 0){
            System.out.print(rootNode.data+" ");
        }
        else if(level > 0){
            levelOrder(rootNode.left, level-1);
            levelOrder(rootNode.right, level-1);
        }
    }

    public void printLevelOrder(Node rootNode){
        int height = heightOfTree(rootNode);
        for(int i=0; i<height; i++){
            levelOrder(rootNode, i);
        }
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

        System.out.print("\nInorder : ");
        tree.inorder(tree.root);
        System.out.print("\nPreorder : ");
        tree.preorder(tree.root);
        System.out.print("\nPostorder : ");
        tree.postorder(tree.root);

        System.out.println("\nHeight of tree is : "+tree.heightOfTree(tree.root));
        System.out.print("Level order AKA BFS :");
        tree.printLevelOrder(tree.root); //
    }   
}