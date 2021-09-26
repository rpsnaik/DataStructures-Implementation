package LinkedList.linkedLists;

public class LinkedList{
    public Node head;

    public void push(int data){
        Node tempNode = null;
        if(head != null){
            tempNode = head;
            while(tempNode.next!=null){
                tempNode = tempNode.next;
            }
            tempNode.next = new Node(data);
        }else{
            head = new Node(data);
        }
    }


    public void popAtIndex(int index){
        index = index-1;
        if(index < 0){
            head = head.next;
            return;
        }
        Node tempNode = head;
        int currIndex = 0;
        while(tempNode != null){
            if(currIndex == index){
                if(tempNode.next != null){
                    tempNode.next = tempNode.next.next;
                }else{
                    tempNode.next = null;
                }
                break;
            }
            tempNode = tempNode.next;
            currIndex++;
        }
    }

    public void findMiddle(){
        Node slowPointer = head, fastPointer = head;
        while(fastPointer != null && fastPointer.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        System.out.println("Middle element is : "+slowPointer.data);
    }

    public void printLinkedList(){
        Node tempNode = null;
        if(head != null){
            tempNode = head;
            while(tempNode != null){
                System.out.print(tempNode.data+"-->");
                tempNode = tempNode.next;
            }
        }else{
            System.out.println("Empty linked list");
        }
    }
}