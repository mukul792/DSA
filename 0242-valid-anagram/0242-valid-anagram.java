class Solution {
    public static HashMap<Character,Integer> mp(String str){
        HashMap<Character,Integer> check = new HashMap<>();
        for(var e : str.toCharArray()){
            if(check.containsKey(e)){
                check.put(e,check.get(e)+1);
            }
            else{
                check.put(e,1);
            }
        }
        return check;
    }
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){return false;}
        HashMap<Character,Integer> mp1 = mp(s);
        HashMap<Character,Integer> mp2 = mp(t);
        return mp1.equals(mp2);
    }
}