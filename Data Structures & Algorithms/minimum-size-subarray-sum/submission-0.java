class Solution {
    public int minSubArrayLen(int target, int[] nums) {
      int left=0;
      int right =0;
      int sum=0;
      int result=Integer.MAX_VALUE;

      while(right<nums.length)
      {
        sum=sum+nums[right];

        while(sum>=target)
        {
            sum=sum-nums[left];
            result=Math.min(right-left+1,result);
            left++;
        }

        right++;

      }

      return result==Integer.MAX_VALUE?0:result;

    }
}