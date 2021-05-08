import java.util.*;


public class bj_8958 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 0; i< num; i ++) {
			String str = sc.next();
			int sum = 0;
			int count = 0;	
			int leng = str.length();
			char[] Array = new char[leng];
			for(int j = 0; j < leng; j++) {
				Array[j] = str.charAt(j);
				if(Array[j] == 'O') {
					count ++;
					sum+= count;
				}
				else{
					count = 0;
				}
				
			}
			
			System.out.println(sum);
			
			
		}
	}

}
