class Solution {
    public static HashMap<Character,Integer> mp(String str){
        HashMap<Character,Integer> check = new HashMap<>(); //putting both the strings and making frequency map of each character
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
        if(s.length()!=t.length()){return false;} //if length are different then no anagram
        HashMap<Character,Integer> mp1 = mp(s);
        HashMap<Character,Integer> mp2 = mp(t);
        return mp1.equals(mp2); //checking both the string hashmaps if they are equal true else false
    }
}