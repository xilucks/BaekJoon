import java.util.*;
public class bj_1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int examnum;
		double max = -1;
		double sum = 0;
		examnum = sc.nextInt();
		double[] array = new double[examnum];
		for(int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			if(array[i]> max) {
				max = array[i];
			}
		}
		for(int i = 0; i<array.length; i ++) {
			array[i] = (array[i]/max)*100;
			sum += array[i];
		}
		System.out.println(sum/examnum);
}

}
