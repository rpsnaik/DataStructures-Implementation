package Trees.binaryTree;

public class BinarySearchTree {
    public Node root;

    public void add(int value){
        if(root == null){
            root = new Node(value);
        }else{
            traverseAndAdd(root, value);
        }
    }

    private void traverseAndAdd(Node rootNode, int value){
        if(rootNode.data > value){
            if(rootNode.left != null){
                traverseAndAdd(rootNode.left, value);
            }else{
                rootNode.left = new Node(value);
            }
        }else{
            if(rootNode.right != null){
                traverseAndAdd(rootNode.right, value);
            }else{
                rootNode.right = new Node(value);
            }
        }
    }

    public void printBinaryTree(Node rootNode){
        if(rootNode.left != null){
            printBinaryTree(rootNode.left);
        }
        System.out.print(rootNode.data+" ");
        if(rootNode.right != null){
            printBinaryTree(rootNode.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(50);
        tree.add(30);
        tree.add(10);
        tree.add(15);
        tree.add(40);
        tree.add(55);
        tree.add(48);
        tree.add(54);
        tree.add(52);
        tree.add(57);
        tree.printBinaryTree(tree.root);
    }
}


        //         50
        //        /   \
        //     30         55
        //   /   \       /  \
        // 10     40    54   57
        //     \    \   /
        //      15   48 52
        //            
        //           