class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int ans = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum = nums[i] + sum;

            if (mp.containsKey(sum - k)) {
                ans = ans + mp.get(sum - k);
            }

            if(mp.containsKey(sum)){
                mp.put(sum,mp.get(sum)+1);
            }
            else{
                mp.put(sum,1);
            }
        }
        return ans;
    }
}