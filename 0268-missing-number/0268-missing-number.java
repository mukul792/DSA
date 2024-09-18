class Solution {
    public int missingNumber(int[] nums) {
        int j =-1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(++j!=nums[i]){
                return j;
            }
        }
        return j+1;
    }
}
