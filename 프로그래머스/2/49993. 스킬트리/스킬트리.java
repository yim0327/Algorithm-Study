import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        ArrayList<String> list = new ArrayList<>(Arrays.asList(skill_trees));
        Iterator<String> it = list.iterator();
        
        while (it.hasNext()) {
            if (skill.indexOf(it.next().replaceAll("[^"+skill+"]", "")) != 0) {
                it.remove();
            }
        }
        
        return list.size();
    }
}