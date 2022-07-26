package TopKFrequentElements347;

public class Main {
    public static void main(String[] args) {
        Solution1 mySolution2 = new Solution1();
        int k = 2;
        int[] nums = new int[]{2,2,2,3,2,3,3,1,1,1};
        int [] result = mySolution2.topKFrequent(nums,k);
       for(int i : result){
           System.out.println(i);
       }
    }
}
