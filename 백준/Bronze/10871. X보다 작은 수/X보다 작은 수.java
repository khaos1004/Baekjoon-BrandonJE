import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();					 
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] arr = new int[N];	
        
         for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] < X){
                System.out.print(arr[i] + " ");
            }
        }
    }
}