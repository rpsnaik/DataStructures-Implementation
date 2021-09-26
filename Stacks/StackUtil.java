package Stacks;

import LinkedList.linkedLists.Node;

public class StackUtil{
    Node top;
    
    public void push(int data){
        if(top == null){
            top = new Node(data);
        }else{
            Node newNode = new Node(data);
            newNode.next = top;
            top = newNode;
        }
    }

    public void pop(){
        top = top.next;
    }

    public void peek(){
        if(top != null){
            System.out.println(top.data);    
        }else{
            System.out.println("Stack is empty");
        }
        
    }
}