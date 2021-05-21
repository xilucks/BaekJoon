import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;
public class bj_1874 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		int n = sc.nextInt();//������ ����
		int count = 1;
		for(int i =0; i<n; i++) {
			int num = sc.nextInt(); //������ �ϴ� ����
			
			if (stack.empty()==false&&num == stack.peek()) {
				stack.pop();
				sb.append("-\n");
			}
			else if(count <= num) {
				for(int j =count; j<=num; j++) {
					stack.push(j);
					sb.append("+\n");
					count ++;
				}
					stack.pop();
					sb.append("-\n");
					
				}
			else if(num>=stack.peek()) {
				while(num > stack.peek()||stack.empty() ==true) {
					stack.push(count+1);
					sb.append("+\n");
					count ++;
				}
				stack.pop();
				sb.append("-\n");
			}
		}
		if(stack.empty()==true && count-1 == n) {
			System.out.println(sb);
		}
		else {
			System.out.print("NO");
		}
	}

}
