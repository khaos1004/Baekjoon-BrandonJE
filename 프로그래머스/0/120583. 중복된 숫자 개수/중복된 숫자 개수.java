import java.util.*;
import java.util.stream.Stream;

class Solution {
    public int solution(int[] array, int n) {        
        
        long answer = Arrays.stream(array)
              .filter(i -> i == n)
              .count();
        
        return (int)answer;
    }
}