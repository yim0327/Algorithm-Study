import java.util.*;

class Solution {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        
        int front = phone_number.length()-4;
        int back = phone_number.length();
        
        sb.append("*".repeat(front));
        sb.append(phone_number.substring(front, back));
                  
        return sb.toString();
    }
}