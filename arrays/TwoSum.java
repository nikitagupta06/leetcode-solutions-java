import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] result = solution(nums, 9);
        for (int i : result) {
            System.out.println(i);
        }
    }
    public static int[] solution(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                return new int[]{i, map.get(nums[i])};
            }
            else{
                map.put(target-nums[i], i);
            }
        }
        return new int[]{0,0};
    }
    
}