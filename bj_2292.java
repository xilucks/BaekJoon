import java.util.Scanner;

public class bj_2292 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long sum = 1;
		int count = 1 ;
		while (sum<n){
			sum += 6*(count);  //1. 7. 19
			count++;
		}
		System.out.println(count);
		
	}

}
