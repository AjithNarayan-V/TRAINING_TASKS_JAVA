import java.util.Stack;

public class queue_using_stack{
    private Stack<Integer> stack1; // For enqueue operation
    private Stack<Integer> stack2; // For dequeue operation

    public queue_using_stack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int item) {
        stack1.push(item);
    }

    public int dequeue() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                System.out.println("Queue is empty");
                return -1; // Return -1 or throw an exception indicating queue underflow
            }
            // Transfer elements from stack1 to stack2 to reverse the order
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        // Pop from stack2 which contains elements in the right order
        return stack2.pop();
    }

    public static void main(String[] args) {
        queue_using_stack queue = new queue_using_stack();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue()); // Output: 1
        System.out.println(queue.dequeue()); // Output: 2
        queue.enqueue(4);
        System.out.println(queue.dequeue()); // Output: 3
        System.out.println(queue.dequeue()); // Output: 4
        System.out.println(queue.dequeue()); // Output: -1 (Queue is empty)
    }
}