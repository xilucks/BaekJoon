import java.util.*;
public class bj_10818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max, min;
		max = -1000001;
		min = 1000001;
		int [] Array = new int[n];
		for(int i = 0; i<n; i ++) {
			Array[i] = sc.nextInt();
			if(max<Array[i]) {
				max = Array[i];
			}
			if(min>Array[i]) {
				min = Array[i];
			}
		}
		System.out.println(min +" "+max);
		
	
		

	}

}
