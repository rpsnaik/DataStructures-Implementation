package LinkedList.middleElement;
import LinkedList.linkedLists.*;

public class findMiddleElement {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.push(10);
        linkedList.push(4);
        linkedList.push(5);
        linkedList.push(1);
        linkedList.push(8);
        linkedList.push(12);
        linkedList.push(14);
        linkedList.push(15);

        linkedList.findMiddle();
    }
}
