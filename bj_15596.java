import java.util.Scanner;

public class bj_15596 {
	static long sum(int[] a) {
		int amount = 0;
		for(int i = 0; i< a.length; i++){
			amount += a[i];
		}
		return amount;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < n; i ++ ) {
			array[i]= sc.nextInt();
			
		}
		System.out.println(sum(array));
	}

}
