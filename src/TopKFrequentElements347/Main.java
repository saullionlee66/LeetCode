package TopKFrequentElements347;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Solution1 mySolution2 = new Solution1();
        int k = 2;
        int[] nums = new int[]{3,1,2,2,2,3};
        int [] result = mySolution2.topKFrequent(nums,k);
        for(int i : result){
           System.out.println(i);
        }
    }
}
