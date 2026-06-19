import java.util.LinkedHashSet;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) return cities.length * 5;

        LinkedHashSet<String> cache = new LinkedHashSet<>();
        int answer = 0;

        for (String city : cities) {
            city = city.toLowerCase();

            if (cache.contains(city)) {
                cache.remove(city);
                answer += 1;
            } 
            else {
                if (cache.size() == cacheSize) {
                    String oldest = cache.iterator().next();
                    cache.remove(oldest);
                }
                answer += 5;
            }

            cache.add(city);
        }

        return answer;
    }
}