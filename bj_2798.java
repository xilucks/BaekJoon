import java.util.Scanner;

public class bj_2798 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();//카드개수
		int m = sc.nextInt();//맞춰야하는 숫자
		int[] Array = new int[t];
		for(int i = 0; i<t; i++) {
			Array[i] = sc.nextInt();
		}
		int max = 0;
		for(int i =0; i<t-2; i++) {
			for(int j = i+1; j<t-1;j++) {
				for(int k = j+1; k<t; k++) {
					int sum = Array[i]+Array[j]+Array[k];
					if(sum <= m && sum>max) {
						max = sum;
					}
				}
			}
		}
		System.out.println(max);
	}

}
