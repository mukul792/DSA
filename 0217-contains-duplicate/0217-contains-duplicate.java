class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap <Integer,Integer> mp = new HashMap<>();
        for(var e : nums){
            if(mp.containsKey(e)){
                return true;
            }
            else{
                mp.put(e,1);
            }
        }
        return false;
    }
}