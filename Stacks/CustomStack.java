package Stacks;

public class CustomStack {
    
    public static void main(String[] args) {
        StackUtil stackUtil = new StackUtil();
        stackUtil.push(10);
        stackUtil.push(20);
        stackUtil.push(30);
        stackUtil.push(40);

        stackUtil.peek();

        stackUtil.pop();
        stackUtil.pop();
        
        stackUtil.peek();
    }
}
