import java.util.*;

class Solution {
    public int solution(int[] array, int height) {        
        
        int answer = 0;
        long count = Arrays.stream(array)
            .filter(i -> i > height)
            .count();
                     
        return (int)count;
    }
}
