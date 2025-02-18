class Solution {
    public String[] solution(String my_str, int n) {
        int len = my_str.length()%n == 0 ? my_str.length()/n : my_str.length()/n+1;
        String[] answer = new String[len];
        int a = 0;
        int b = n;
        
        
        for(int i = 0; i < len; i++){
            if(b > my_str.length()){
                answer[i] = my_str.substring(a);
            } 
            else{
                answer[i] = my_str.substring(a, b);
                a += n;
                b += n;
            }
        }
        
        return answer;
    }
}