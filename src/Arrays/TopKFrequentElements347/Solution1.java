package Arrays.TopKFrequentElements347;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Solution1 {
    public int[] topKFrequent(int[] nums, int k){
        //O(n) time complexity
        HashMap<Integer, Integer> map = new HashMap<>();
        //Store each num's frequency and max Frequency
        int maxFreq = 0;
        for(int num : nums){
            //classic way to store frequency
            map.put(num,map.getOrDefault(num,0) + 1 );
            maxFreq = Math.max(maxFreq, map.get(num));
        }

        //Now, need to convert frequency into an arry of linkedlist, with index with corresponding number(s)
        //such as, index 3 store [1], index 2 store [2], in example, [1,1,1,2,2,3]
        //or index 3 store [1,2], index 2 store [], index 1 store [3] in example [1,1,1,2,2,2,3]
        List<Integer>[] bucketList = new LinkedList[maxFreq + 1]; //array size is maxFreq plus 1
       //initialize the array with all empty LinkedLists
        for(int i = 0; i <= maxFreq; i++){
            bucketList[i] = new LinkedList<>();
        }
        //fill the numbers into the LinkedList
        for(Integer key : map.keySet()){
            int freq = map.get(key);
            bucketList[freq].add(key);
        }
        //prepare to fill the final result array
        int[] result = new int[k];
        int index = k - 1;
        int count = 0;
        //fill the result array with the frequency array number
        for(int i = maxFreq; i >=0; i--){
            List<Integer> currentList = bucketList[i];
            for(Integer num : currentList){
                if(count < k){
                    result[index] = num;
                    index--;
                    count++;
                }else{
                    return result;
                }
            }
        }
        return result;
    }
}
