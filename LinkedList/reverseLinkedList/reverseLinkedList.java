package LinkedList.reverseLinkedList;
import LinkedList.linkedLists.*;

public class reverseLinkedList {
    public static void reverse(LinkedList linkedList){
        Node prevNode=null;
        Node nextNode=null;
        Node currentNode = linkedList.head;

        while(currentNode != null){
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        linkedList.head = prevNode;
    }
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.push(1);
        linkedList.push(2);
        linkedList.push(3);
        linkedList.push(4);
        linkedList.push(5);
        linkedList.push(6);
        linkedList.push(7);
        linkedList.push(8);
        linkedList.printLinkedList();
        reverse(linkedList);
        System.out.println("\nAfter reverse");
        linkedList.printLinkedList();

    }
}
