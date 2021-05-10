import java.util.*;
public class bj_1316 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for(int i = 0 ; i < n ; i++) {
			int top = 0;
			int ind = 0;
			char[] stack = new char[1000];
			String s = sc.next();
			for(int j = 0; j <s.length(); j++) {
				char ch = s.charAt(j);
				if(j == 0 ) {
					stack[top] = ch;
					top++;
					
				}
				else if (j>0 && stack[top-1] != ch) {
					stack[top] = ch;
					top++;
					
				}
				else {
					continue;
				}
			}
			loop :
			for(int j = 0; j <top-1; j++) {
				for(int k = j+1; k < top; k++) {
					if(stack[j] != stack[k]) {
						continue;
					}
					else {
						count++;
						ind = -1;
						break;
					}
				}
				if(ind == -1) {
					break;
				}
			}
			
			
		}
		System.out.println(n - count);
	}

}
