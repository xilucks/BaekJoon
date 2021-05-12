import java.util.Scanner;

public class bj_2869 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int v = sc.nextInt();
		int result = (v-a)/(a-b);
		if(result <1) {
			result ++;
			}
		System.out.println(result+1);
	}
}
