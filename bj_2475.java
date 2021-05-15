import java.util.Scanner;
import java.util.*;
public class bj_2475 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i = 0; i <5;i ++) {
		int a = sc.nextInt();
		sum += Math.pow(a, 2);
		}
		int result = sum%10;
		System.out.println(result);
		

	}

}
