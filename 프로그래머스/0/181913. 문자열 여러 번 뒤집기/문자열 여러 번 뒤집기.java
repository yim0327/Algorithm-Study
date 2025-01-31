import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        String in = my_string;
        String out = "";
        
        //----------------------------------------------------
        for(int i = 0; i < queries.length; i++){
            int s = queries[i][0]; // 6
            int e = queries[i][1]; // 10
            
            Deque<Character> deque = new ArrayDeque<>();
            
            for(int j = 0; j < my_string.length(); j++){
                if(j < s){ // 0 - 5
                    out += in.charAt(j);
                }
                else if(j >= s && j <= e){ // 6 - 10
                    deque.addLast(in.charAt(j));
                }
                else if(j > e){
                    if(j == e+1){
                        for(int k = 0; k <= e-s; k++){
                            out += deque.removeLast();
                        }
                        out += in.charAt(j);
                    }
                    else{
                        out += in.charAt(j);
                    }
                }
            }
            
            while(!deque.isEmpty()){
                out += deque.removeLast();
            }
                
                
            in = out;
            out = "";
        }
        //----------------------------------------------------
        answer = in;
        
        return answer;
    }
}