import java.util.*;
public class bj_2577 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		int result;
		a = sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		result = a*b*c;
		sc.close();
		String nums = Integer.toString(result);
		char[]Array =new char[nums.length()];
		for(int i = 0; i <nums.length(); i++) {
			Array[i] = nums.charAt(i);
		}
		int count = 0;
		char index = '0';
		for(int i = 0; i <=9; i++) {
			for(int j =0; j <Array.length; j++) {
				if(Array[j] == index) {
					count ++;
				}
			}
			System.out.println(count);
			count = 0;
			index ++;
			
		}
	}

}
