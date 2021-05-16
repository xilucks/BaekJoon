import java.util.Scanner;

public class bj_2750 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] Array = new int[n];
		int min;
		for(int i = 0; i<n ; i++) {
			Array[i] = sc.nextInt();
		}
		int tmp ;
		
		for(int i = 0; i<n-1; i++) {
			min = i;
			for(int j = i+1;j<n;j++) {
				if(Array[j]<Array[min]) {
					tmp = Array[j];
					Array[j]=Array[min];
					Array[min]= tmp;
				}
			}
		}
		for(int i =0; i<n; i++)
		System.out.println(Array[i]);
	}

}
