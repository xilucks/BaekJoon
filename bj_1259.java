import java.util.*;
import java.io.*;
public class bj_1259 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		
		while(str.charAt(0) != '0') {
			int[] arr = new int[str.length()];
			int index;
			for(int i =0; i<str.length(); i++) {
				arr[i] = str.charAt(i);
			}
			index = str.length()/2;
			String ans = "";
			for(int i = 0; i<index; i++) {
				if(arr[i] == arr[str.length()-1-i]) {
					ans = "yes";
				}
				else {
					ans = "no";
					break;
				}
				
			}
			if(str.length() == 1) {
				ans ="yes";
			}
				System.out.println(ans);
				str = sc.next();
		}

	}

}
