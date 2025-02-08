class Solution {
    public String[] solution(String[] strArr) {
        for(int i = 1; i < strArr.length; i+=2){
            strArr[i] = strArr[i].toUpperCase();
            strArr[i-1] = strArr[i-1].toLowerCase();
        }
        
        if(strArr.length % 2 != 0){
            strArr[strArr.length-1] = strArr[strArr.length-1].toLowerCase();
        }
        
        return strArr;
    }
}