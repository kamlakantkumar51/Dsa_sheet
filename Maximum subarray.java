class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        
       int cs = nums[0];//currentsum
       int ms = nums[0];//maximumsum

       for(int i=1;i<nums.length;i++){
        cs = Math.max(nums[i],cs + nums[i]);
        ms = Math.max(ms,cs);
       }
       return ms;
    }
}
