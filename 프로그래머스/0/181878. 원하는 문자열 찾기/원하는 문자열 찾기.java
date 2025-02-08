class Solution {
    public int solution(String myString, String pat) {
        int idx = -1;
        
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        
        idx = myString.indexOf(pat);
        
        return (idx == -1 ? 0 : 1);
    }
}