class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = false;
        boolean tmp1 = true;
        boolean tmp2 = true;
        
        if(x1 == false && x2 == false){
            tmp1 =  false;
        }
        if(x3 == false && x4 == false){
            tmp2 = false;
        }
        
        if(tmp1 == true && tmp2 == true){
            answer = true;
        }
        
        return answer;
    }
}