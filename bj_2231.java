import java.util.Scanner;

public class bj_2231 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result = 0;
		for(int i = 1; i<num; i++) {
			int sum =i;
			int number = i;
			while(number != 0) {
				sum += number%10;
				number /= 10;
			}
			if( sum == num) {
				result = i;
				break;
			}
			else {
				result = 0;
			}
			
			
		}
		System.out.println(result);
		
		
	}

}
