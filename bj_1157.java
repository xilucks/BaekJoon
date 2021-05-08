import java.util.Scanner;

public class bj_1157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		String S = sc.next();
		int[] Array = new int[26];
		//스팰링 카운트
		for(int i = 0; i<S.length(); i++) {
			char spell = S.charAt(i);
			int spellnum = (int)spell;
			if(spellnum>96) {
				Array[spellnum-97] +=1;
			}
			else {
				Array[spellnum-65] +=1;
			}
		}
			//인덱스값저장
			int index = 0;
			int maximum = 0;
			for(int i = 1; i <26; i ++) {
				if(Array[maximum]<Array[i]) {
					maximum = i;
				}
			}
				index = maximum;
			//정렬
			int max;
			int tmp;
			for(int i = 0; i <Array.length; i++) {
				max = i;
				for(int j = i+1; j<Array.length; j++) {
					if(Array[max]<Array[j]) {
						tmp = Array[max];
						Array[max] = Array[j];
						Array[j] = tmp;
					}
				}
			}
			//인덱스값 문자로 반환
			char result = (char)(index+65);
			//중복값처리
			if(Array[0] == Array[1]) {
				System.out.println("?");
			}
			else {
			System.out.println(result);
			}
	}

}
