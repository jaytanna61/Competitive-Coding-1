// Time Complexity : O(log(n))
// Space Complexity : 0(n) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no


public class Main {
    public static void main(String[] args) {
       int[] array = {1,2,3,5,6,7,8};
       System.out.println(""+helper(array));
    }
    private static int helper(int[] nums){
        int start = 0,end = nums.length-1;
        if(nums.length == 1)
            return nums[1] == 0 ? -1 : 1;
        if(nums[nums.length-1] == nums.length)
            return nums.length+1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(end-1 == start){
                if(nums[start] != start+1)
                    return start+1;
                if(nums[end] != end +1)
                    return end+1;
            }
            if(nums[mid] == mid+1)
                start = mid;
            else
                end = mid;
        }
        return -1;
    }
}
