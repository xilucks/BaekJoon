import java.util.Scanner;
//stack을 이용한 풀이 실패
public class bj_2941 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] Stack = new char[100];
		int top = -1;
		int count = 0;
		for(int i = 0; i <s.length(); i ++) {
			char ch = s.charAt(i);
			top ++;
			Stack[top] = ch;
			
			if(ch == '=') {
				if(Stack[top-1] == 'z') {
					if(Stack[top-2] == 'd') {
						top -=2;
					}
					else {
						top --;
					}
				}
				else {
					top --;
				}
			}
			else if(ch == '-' ) {
				top --;
			}
			else if(ch == 'j') {
				if(Stack[top-1] == 'l' || Stack[top-1] =='n') {
					top--;
				}
				
			}


			
		}

		System.out.println(top+1);
	}
}
