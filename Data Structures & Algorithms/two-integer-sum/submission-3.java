class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> compliment = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int difference = target - nums[i];
            if(compliment.containsKey(difference)){
                return new int[]{compliment.get(difference), i};
            }
            compliment.put(nums[i], i);
        }
        return new int[]{};
    }
}
