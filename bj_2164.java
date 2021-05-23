import java.util.Scanner;
import java.io.*;
public class bj_2164 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int head, tail;
		int[] arr = new int[1000000];
		for(int i = 1 ; i<=n; i++) {
			arr[i-1] = i;
		}	
		head = 0;
		tail = n-1;
		int result = 0;
		while(true) {
			int change = arr[head+1];
			if (n ==1 ) {
				result = 1; break;
			}
			if(arr[head+2] == 0) {
				result = arr[head+1];
				break;
			}
			head += 2;
			tail++;
			arr[tail] = change;
			
			
			
		}
		System.out.println(result);
	}
}
