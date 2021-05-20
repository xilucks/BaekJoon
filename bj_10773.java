import java.util.Scanner;

public class bj_10773 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] stack = new int[n];
		int sum = 0;
		int top = -1;
		for(int i = 0; i<n; i++) {
			int num = sc.nextInt();
			
			if(num != 0) {
				top++;
				stack[top] = num;
				sum += stack[top];
				
			}
			else {
				sum -= stack[top];
				top--;
			}
			
		}
		System.out.println(sum);

	}

}
