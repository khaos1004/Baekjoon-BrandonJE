class Solution {
    public int solution(int num, int n) {
        int answer = 0;
        answer = num % n != 0 ? 0 : 1;
        return answer;           
}
}