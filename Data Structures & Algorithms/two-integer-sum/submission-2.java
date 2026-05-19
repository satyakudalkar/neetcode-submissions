class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] res = new int[2];
        int i=0;
        int j=nums.length-1;
        while(i<nums.length){
            if(nums[i]+nums[j]==target && i != j){
                res[0] = i;
                res[1] = j;
                break;
            }
            if(j<=i){
                i++;
                j=nums.length-1;
            }else{
                j--;
            }
        }
        return res;
    }
}
