import java.util.Scanner;

public class bj_2839 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int five = n/5;
		int three = 0;
		int last =  n-five*5-three*3;
		while(last != 0) {
			
			if(last%3 ==0) {
				three ++;
			}
			else if(five>=1) {
				five--;
			}
			else if(five == 0 && last%3 !=0) {
				three = -1;
				five = 0;
				break;
				
			}
			last =  n-five*5-three*3;	
			
		}
		if(three>0) {
		System.out.println(five+(three));
		}
		else {
			System.out.println(five+three);
		}
	}

}
