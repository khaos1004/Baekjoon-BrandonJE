import java.util.*;

public class Solution {
    public static void main(String[] args) {
        try
        (Scanner sc = new Scanner(System.in))
        {
            String str = sc.next();        
            int n = sc.nextInt();        
            System.out.print(str.repeat(n));
        }        
    }
}