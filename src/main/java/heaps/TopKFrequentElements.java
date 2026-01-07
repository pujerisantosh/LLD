package heaps;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {

    static int[] solve(int[] arr, int k) {

        //Frequency map

        Map<Integer, Integer> frq = new HashMap<>() ;

            for (int x: arr){
                frq.put(x, frq.getOrDefault(x,0)+1);
            }


        // min heap based on frequency
        PriorityQueue<Integer> pq = new PriorityQueue<>(

                (a,b) -> frq.get(a) - frq.get(b)

        );


            // keep heap size k

        for (int num : frq.keySet()){
            pq.offer(num);
            if (pq.size() > k) pq.poll();
        }

        // extract answer
        int[] ans = new int[k];
        for (int i=0;i<k;i++){
            ans[i] = pq.poll();
        }


        return arr;
    }
}
