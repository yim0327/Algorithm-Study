class Solution {
    public int[] solution(String myString) {
        if(myString.charAt(myString.length()-1) == 'x'){
            myString += " ";
        }
                
        String[] tmp = myString.split("x");
        int[] answer = new int[tmp.length];
        
        for(int i = 0; i < tmp.length; i++){
            answer[i] = tmp[i].length();
        }
        
        if(myString.charAt(myString.length()-1) == ' '){
            answer[answer.length-1] -= 1;
        }
        
        return answer;
    }
}