class Solution 
{
    public int search(int[] nums, int target) 
    {
        int idx = 0;
        for(int num : nums)
        {
            if(num == target) return idx;
            idx++;
        }
        return -1;
    }
}