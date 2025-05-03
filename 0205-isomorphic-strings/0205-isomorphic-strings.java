class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> mp = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            Character sCh = s.charAt(i);       //0-f , 1-o , 2-o , 3-x
            Character tCh = t.charAt(i);       //0-b , 1-a , 2-a , 3-a

            if(mp.containsKey(sCh)){
                if(mp.get(sCh)!=tCh)            //checks for already existing value of s key must be equal t string value
                return false;                   //if 2nd time occuring s is not equal to 2nd time occuring t then false
            }
            else if(mp.containsValue(tCh)){     //checks for the duplication of value 
                return false;                   //if two keys map same value error
            }
            else{
                mp.put(sCh,tCh);
            }
        }
        return true;
    }
}