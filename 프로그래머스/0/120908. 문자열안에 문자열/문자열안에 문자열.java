class Solution {
    public int solution(String str1, String str2) {
        if(str1.toLowerCase().contains(str2.toLowerCase())){
            return 1 ;
        }
        else
            return 2;
    }
}