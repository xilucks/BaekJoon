import java.util.Scanner;

public class bj_4949 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str;
		
		while(true) {
			String result = "yes";
			char ch = 0;	
			int top = -1;
			char[] stack = new char[100];
			str = sc.nextLine();
			int count = 0;
			if (str.equals(".")) break;
			for(int i = 0; i< str.length(); i++) {
			ch = str.charAt(i);
			switch (ch) {
			case '(' :
			case '[' :
				++top;
				stack[top] = ch;
				break;
			case ')' :
				if(top == -1 || stack[top] =='[') {
					result = "no";
				}
				else {
					result = "yes";
					top --;
				}
				break;
			case ']' :
				if(top==-1 || stack[top] == '(') {
					result = "no";
				}
				else {
					result = "yes";
					top --;
				}
				break;
			
			}
			if (result == "no") break;
			}
		
				if(result == "yes" && top == -1) {
					result = "yes";
				}
				else {
					result = "no";
				}
				
				System.out.println(result);
			
	}
		
		

}
}
