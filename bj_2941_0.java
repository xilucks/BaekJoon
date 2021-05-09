import java.util.Scanner;

public class bj_2941_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char[] Stack = new char[1000];
		String str = sc.next();
		int top = 5;
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			top ++;
			Stack[top] = ch;
			
		}
		while(top >= 6) {
			
			if(Stack[top] == '=') {
				if(Stack[top-1] == 'z') {
					if(Stack[top-2] == 'd') {
						top = top-3;
						count++;
					}
					else {
						top -=2;
						count++;
					}
				}
				else {
					top -=2;
					count++;
				}
			}
			else if(Stack[top] == '-') {
				top -=2;
				count++;
			}
			else if(Stack[top] == 'j') {
				if(Stack[top-1] == 'l' || Stack[top -1] == 'n') {
					top -=2;
					count ++;
				}
				else {
					top -=1;
					count++;
				}
			}
			else {
				top -= 1;
				count++;
			}
		}
		
	
		System.out.println(count);
	}

}
