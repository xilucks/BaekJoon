import java.util.Scanner;

public class bj_10809 {
// ascii a == 97
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String spells = sc.next();
		int[] Array = new int [26];
		for(int i = 0; i <Array.length; i++) {
			Array[i] = -1;
		}
		for(int i = 0; i <Array.length; i ++) {
			for(int j = 0; j<spells.length(); j++) {
				char spell = spells.charAt(j);
				int spellnum = (int)spell;
				if(spellnum-97 == i&&Array[i] == -1) {
					Array[i] = j;
				}
			
			}
		}
		for(int i = 0; i <Array.length; i ++) {
		System.out.print(Array[i]+" ");
		}

	}

}
