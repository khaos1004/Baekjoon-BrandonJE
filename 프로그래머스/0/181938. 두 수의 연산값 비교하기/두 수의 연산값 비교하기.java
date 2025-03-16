class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int c = Integer.parseInt(String.valueOf(a).concat(String.valueOf(b)));
        int d = 2 * a * b;
        answer = c > d ? c : d;
        return answer;
    }
}