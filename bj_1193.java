import java.util.Scanner;



public class bj_1193 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		//1,2,4,7,11,16
		int n = sc.nextInt();;
		int sum = 1;
		int add = 1;
		while(true) {
			sum += add;
			add++;
			if(sum>n) {
				break;
			}
		}
		if((add-1)%2 ==0 ) {
			System.out.println(((add-1)-(sum-n-1))+"/"+(1+(sum-n-1)));
		}
		else {
			System.out.println((1+(sum-n-1))+"/"+((add-1)-(sum-n-1)));	
		}
		}
}

