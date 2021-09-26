package Queues;

import LinkedList.linkedLists.Node;

public class QueueUtil implements QueueInterface{
    Node startNode;

    @Override
    public void push(int data) {
        Node newNode = new Node(data);
        if(startNode == null){
            startNode = newNode;
        }else{
            Node tempNode = startNode;
            while(tempNode.next != null){
                tempNode = tempNode.next;
            }

            tempNode.next = newNode;
        }
    }
    @Override
    public void pop() {
        if(startNode != null){
            startNode = startNode.next;
        }
    }
    @Override
    public void peek() {
        System.out.println(startNode.data);
    }
}
