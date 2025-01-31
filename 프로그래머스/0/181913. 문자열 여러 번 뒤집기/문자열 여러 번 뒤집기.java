import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    public String solution(String my_string, int[][] queries) {
        String in = my_string;
        String out = "";
        
        for(int i = 0; i < queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            
            Deque<Character> deque = new ArrayDeque<>();
            
            for(int j = 0; j < my_string.length(); j++){
                if(j < s){
                    out += in.charAt(j);
                }
                else if(j >= s && j <= e){
                    deque.addFirst(in.charAt(j));
                }
                else if(j > e){
                    if(j == e+1){
                        for(int k = 0; k <= e-s; k++){
                            out += deque.removeFirst();
                        }
                        out += in.charAt(j);
                    }
                    else{
                        out += in.charAt(j);
                    }
                }
            }
            
            while(!deque.isEmpty()){
                out += deque.removeFirst();
            }
                
            in = out;
            out = "";
        }        
        return in;
    }
}