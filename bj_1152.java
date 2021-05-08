import java.util.Scanner;

public class bj_1152 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count = 1;
		for(int i = 0; i <str.length(); i ++) {
			char ch = str.charAt(i);
			if(ch == ' ' ) {
				count ++;
			}
		}
		
		if(str.charAt(0) == ' ') {
			count --;
		}
		if(str.charAt(str.length()-1)==' ') {
			count--;
		}
		
		System.out.println(count);
}
}
