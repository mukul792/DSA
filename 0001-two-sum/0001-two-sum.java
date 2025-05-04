class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int[] t = new int[2];
        // key= number looking for
        // value= its index
        // ex:1                             ex:2
        // 2 = 0    9-2 = 7                 3 = 0      6-3 = 3
        // 7 = 1    9-7 = 2                 2 = 1      6-2 = 4
        // 11 = 2   9-11 = -2               4 = 2      6-4 = 2
        // 15 = 3   9-15 = -6              
        for (int i = 0; i < nums.length; i++) {
            if (mp.containsKey(target - nums[i])) {
                t[0] = mp.get(target -nums[i]);
                t[1] = i;
            } else {
                mp.put(nums[i],i);
            }
        }
        return t;
    }
}
