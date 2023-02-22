class Solution {
    public int[] runningSum(int[] nums) {
        int l=nums.length;
        int runningSum[]= new int[l];
        int sum=0;
        for(int i=0; i<l; i++)
        {
            sum=sum+nums[i];
            runningSum[i]= sum;
        }
        return runningSum;
    }
}
