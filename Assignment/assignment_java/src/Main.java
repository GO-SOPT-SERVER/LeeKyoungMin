import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("<<<<<<<<<Custom Stack Class>>>>>>>>>");
        CustomStack<Integer> stack = new CustomStack<>(100);
        stack.insert(1);
        stack.insert(2);
        stack.insert(3);
        System.out.println("stack is empty -> " + stack.empty());
        System.out.println("stack peek -> " + stack.peek().get());
        System.out.println("stack front -> " + stack.front().get());
        System.out.println("stack size -> " + stack.size());
        stack.remove();
        System.out.println("stack peek after remove -> " + stack.peek().get());
        System.out.println("stack size after remove -> " + stack.size());
        stack.remove();
        stack.remove();
        System.out.println("stack is empty -> " + stack.empty());


        System.out.println("\n<<<<<<<<<Custom Queue Class>>>>>>>>>");
        CustomQueue<Character> queue = new CustomQueue<>(100);
        queue.insert('A');
        queue.insert('B');
        queue.insert('C');
        System.out.println("queue is empty -> " + queue.empty());
        System.out.println("queue peek -> " + queue.peek().get());
        System.out.println("queue back -> " + queue.back().get());
        System.out.println("queue size -> " + queue.size());
        queue.remove();
        System.out.println("queue peek after remove -> " + queue.peek().get());
        System.out.println("queue size after remove -> " + queue.size());
        queue.remove();
        queue.remove();
        System.out.println("queue is empty -> " + queue.empty());
    }
}
