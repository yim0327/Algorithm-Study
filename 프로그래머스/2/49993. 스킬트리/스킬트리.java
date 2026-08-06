import java.util.HashMap;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        String[] arr = skill.split("");
        HashMap<String, Integer> map = new HashMap<>();
        
        int cnt = 0;
        
        for (String s : arr) {
            map.put(s, cnt);
            cnt++;
        }
        
        int answer = 0;
        
        for (String tree : skill_trees) {
            String[] branch = tree.split("");
            
            cnt = 0;
            boolean flag = true;
            
            for (String b : branch) {
                if (map.containsKey(b)) {
                    if (map.get(b) != cnt) {
                        flag = false;
                        break;
                    }
                    else cnt++;
                }
            }
            
            if (flag) answer++;
        }
        
        return answer;
    }
}