package heaps;

import java.util.PriorityQueue;

public class kthLargest {

    public static int solve(int[] arr,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int x: arr){
            pq.add(x);
            if (pq.size() > k) pq.poll();
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int k = 2;
        System.out.println(solve(arr,k));
    }
}
