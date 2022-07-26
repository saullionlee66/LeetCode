package Arrays.TopKFrequentElements347;

import java.util.HashMap;
import java.util.PriorityQueue;

public class Solution2 {
    public int[] topKFrequent(int[] nums, int k){
        //use a priority queue to store the frequency
        //in descending order
        //then poll out k times
        //O(n) = nlog(n)
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num,0) + 1);
        }
        //pq add nums in Ascending order, so the frequency is sorted
        PriorityQueue<Integer> pq = new PriorityQueue<>(
                (n1, n2) -> map.get(n1) - map.get(n2)
        );
        //fill the pq with keys in the hashmap
        for(Integer key : map.keySet()){
            pq.offer(key);
            if(pq.size() > k){
                pq.poll();//FIFO, the smallest got removed firstly
            }
        }

        int [] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = pq.poll();
        }
        return result;
    }

}
