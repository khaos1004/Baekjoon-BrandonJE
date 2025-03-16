class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int c = Integer.parseInt(String.valueOf(a).concat(String.valueOf(b)));
        int d = Integer.parseInt(String.valueOf(b).concat(String.valueOf(a)));
        answer = c > d ? c : d;
        return answer;
    }
}