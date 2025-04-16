package multiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {
        // Create a simple binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);

        // Create thread pool
        ExecutorService executor = Executors.newFixedThreadPool(4);

        // Create and run TreeSizeCalculator
        TreeSizeCalculator calculator = new TreeSizeCalculator(root, executor);
        Future<Integer> future = executor.submit(calculator);

        // Get result and print
        int size = future.get();
        System.out.println("Size of the tree: " + size);

        executor.shutdown();
    }
}
