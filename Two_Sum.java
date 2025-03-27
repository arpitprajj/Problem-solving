import java.util.HashMap;
import java.util.Map;

public class Two_Sum{
   public int[] twoSum(int[] nums, int target) {
       
    Map<Integer,Integer>mp=new HashMap<>();
    for(int i=0;i<nums.length;i++){
        if(mp.containsKey(target-nums[i])){
             int[] arr={i,mp.get(target-nums[i])};
             return arr;
        }
        else{
            mp.put(nums[i],i);
        }
    }
    return null;
       }
}