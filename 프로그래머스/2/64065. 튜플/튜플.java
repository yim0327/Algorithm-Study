import java.util.*;

class Solution {
    public int[] solution(String s) {
        s = s.replace("{", "").replace("}}", "");
        String[] arr = s.split("},");
        Arrays.sort(arr, (String a, String b) -> a.length() - b.length());
        
        String[][] arr2 = new String[arr.length][];
        
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i].split(",");
        }
        
        // 차집합(우) : 누적되는 비교군
        List<String> list = new ArrayList<>(); 
        int[] answer = new int[arr.length];
        
        for (int j = 0; j < arr.length; j++) {
            // 차집합(좌) : 현재 input
            List<String> tmp = new ArrayList<>(Arrays.asList(arr2[j])); 
            tmp.removeAll(list); // 차집합 수행 (tmp = 새로찾은 원소)
            list.add(tmp.get(0)); // 비교군 누적
            
            answer[j] = Integer.parseInt(tmp.get(0));
        }
        
        return answer;
    }
}
