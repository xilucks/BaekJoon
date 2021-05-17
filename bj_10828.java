import java.util.Scanner;
public class bj_10828 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] Array = new int[100000];
		int top = -1;
		for(int i =0; i<n; i++) {
			String st = sc.next();
			if(st.charAt(0)== 'p'&&st.charAt(1) == 'u' ) {
				top++;
				int num = sc.nextInt();
				
				Array[top] = num;
			}
			else if(st.charAt(0) == 't') {
				if(top == -1) {
					System.out.println(-1);
				}
				else
				System.out.println(Array[top]);
			}
			else if(st.charAt(0) == 'p' &&st.charAt(1) =='o') {
				
				if(top == -1) {
					System.out.println(top);
				}
				else {
					System.out.println(Array[top]);
					top --;
				}
			}
			else if(st.charAt(0) == 's') {
				System.out.println(top+1);
			}
			else if(st.charAt(0) =='e') {
				if(top == -1) {
					System.out.println(1);
				}
				else {
					System.out.println(0);
				}
			}
		
		}
	}

}
