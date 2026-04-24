class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] arr = {"aya", "ye", "woo", "ma"};
        
        for (int i = 0; i < babbling.length; i++) {
            String s = babbling[i];
            
            // 가능 단어(arr) = 0~3, 그 외 = 4
            for (int j = 0; j < arr.length; j++) {
                s = s.replace(arr[j], String.valueOf(j));
            }
            s = s.replaceAll("[a-z]+", "4");
            
            // 중복 발음 필터링 (flag == false)
            boolean flag = true;
            
            for (int k = 0; k < s.length()-1; k++) {
                if (s.charAt(k) == s.charAt(k+1)) {
                    flag = false;
                    break;
                }
            }
            
            // 그 외 단어 필터링 (!4)
            if (flag == true && !s.contains("4")) answer++;
        }
        
        return answer;
    }
}