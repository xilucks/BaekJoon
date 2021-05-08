import java.util.*;
public class bj_4344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for(int i = 0; i <test; i ++) {
			double sum =0;
			double average;
			double goodstu = 0;
			int student = sc.nextInt();
			int[] array = new int[student];
			for(int j = 0; j < student; j++) {
				array[j] = sc.nextInt();
				sum += array[j];
			}
				average = sum/student;
			for(int z = 0; z<array.length; z++) {
				if(array[z] > average) {
					goodstu ++;
				}
			}
			double result = ((double)goodstu/student)*100;
			System.out.println(String.format("%.3f", result)+"%");
				
		}
	}

}
