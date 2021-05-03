import java.util.*;
public class bj_2753 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	int year = sc.nextInt();
	int result = 0;
		if(year % 4 == 0) {
			result = 1;
		
			if(year % 100 == 0) {
				result = 0;
			
		}
			if(year % 400 ==0) {
				result = 1;
			}
	}
		System.out.println(result);
	}		
}

