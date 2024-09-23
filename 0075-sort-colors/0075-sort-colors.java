class Solution {
    static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void sortColors(int[] nums) {
        int n = nums.length;
        int start = 0, mid  = 0, last = n-1;
        while(mid<=last){
            if(nums[mid]==0){
                swap(nums,start,mid);
                start++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,mid,last);
                last--;
            }
        }
        
    }
}