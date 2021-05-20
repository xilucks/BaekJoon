import java.util.ArrayList;
import java.util.Collections;

public class bj_4673 {
	 static void selfnumber() {
		ArrayList list = new ArrayList<Integer>();
		int sum= 0;
		for(int i =1;; i++) {
			int a = i*10;
			sum += a/10;
			while(true){
				a /= 10;
				sum += a%10;
				if(a/10 == 0)break;	
			}
			if(sum >=20000) break;
			if (!list.contains(sum)) list.add(sum);
			sum = 0;
		}
		for(int i =1; i<=10000;i++) {
			if(!list.contains(i)) System.out.println(i);
			
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		selfnumber();
	}

}

