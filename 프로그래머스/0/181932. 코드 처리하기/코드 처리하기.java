class Solution {
    public String solution(String code) {
        StringBuilder ret = new StringBuilder();
        int mode = 0;
        
        for (int idx = 0; idx < code.length(); idx++) {
            char currentChar = code.charAt(idx);
            
            if (currentChar == '1') {
                mode = 1 - mode;  // mode를 0에서 1로, 또는 1에서 0으로 전환
            } else if (mode == 0 && idx % 2 == 0) {  // mode가 0이고 인덱스가 짝수일 때
                ret.append(currentChar);
            } else if (mode == 1 && idx % 2 == 1) {  // mode가 1이고 인덱스가 홀수일 때
                ret.append(currentChar);
            }
        }
        
        return ret.length() > 0 ? ret.toString() : "EMPTY";
    }
    
    // 테스트용 main 메서드
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("abc1abc1abc"));  // "acbac"
    }
}