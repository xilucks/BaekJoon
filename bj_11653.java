import java.util.Scanner;

public class bj_11653 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int last =num;
		int count = 2;
		while(last != 1) {
				
				if(last % count == 0) {
					System.out.println(count);
					last = last/count;
					count = 2;
				}
				else {
					count ++;
				}
			
		}

	}

}
