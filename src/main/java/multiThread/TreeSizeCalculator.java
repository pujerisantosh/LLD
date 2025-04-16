package multiThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TreeSizeCalculator implements Callable<Integer> {
    private Node node;
    private ExecutorService executor;

    // Constructor takes node and executor service
    public TreeSizeCalculator(Node node, ExecutorService executor) {
        this.node = node;
        this.executor = executor;
    }

    @Override
    public Integer call() throws Exception {
        if (node == null) {
            return 0;
        }

        Future<Integer> leftSize = null;
        Future<Integer> rightSize = null;

        // Submit left subtree task if exists
        if (node.left != null) {
            leftSize = executor.submit(new TreeSizeCalculator(node.left, executor));
        }

        // Submit right subtree task if exists
        if (node.right != null) {
            rightSize = executor.submit(new TreeSizeCalculator(node.right, executor));
        }

        // Combine results
        int leftResult = (leftSize != null) ? leftSize.get() : 0;
        int rightResult = (rightSize != null) ? rightSize.get() : 0;

        return 1 + leftResult + rightResult;  // count self + left + right
    }
}
