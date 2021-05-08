import java.util.*;
public class bj_11720 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String nums = sc.next();
		int[] Array = new int[num];
		int sum = 0;
		for(int i = 0 ; i < num ; i++) {
			Array[i] = nums.charAt(i);
		}
		for(int i = 0; i < num ; i ++) {
			sum += Array[i]-48;
		}
		System.out.println(sum);
	}

}
