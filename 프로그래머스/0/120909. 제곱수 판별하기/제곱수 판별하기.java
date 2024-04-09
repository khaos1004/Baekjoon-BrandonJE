class Solution {
    public int solution(int n) {
        
        double sqrt = Math.sqrt(n);
         if (sqrt == (int)sqrt) {
            // 제곱수라면 1을 반환합니다.
            return 1;
        } else {
            // 제곱수가 아니라면 2를 반환합니다.
            return 2;
         }
    }
}