package Queues;

public class CustomQueues {
    public static void main(String[] args) {
        QueueUtil queueUtil = new QueueUtil();

        queueUtil.push(10);
        queueUtil.push(20);
        queueUtil.push(30);
        queueUtil.push(40);
        queueUtil.push(50);

        queueUtil.peek();

        queueUtil.pop();
        queueUtil.pop();
        queueUtil.peek();
    }
}
