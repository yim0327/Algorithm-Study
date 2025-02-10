class Solution {
    public int solution(String myString, String pat) {
        myString = myString.replace("A", "b");
        myString = myString.replace("B", "a");
        
        if(myString.contains(pat.toLowerCase())){
            return 1;
        }
        
        return 0;
    }
}