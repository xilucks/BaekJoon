import java.util.ArrayList;
import java.util.Scanner;

public class bj_1181 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		for(int i =0 ; i<n; i++) {
			arr[i] = sc.next();		
		}
		String tmp;
		for(int i =0; i <n-1; i++) {
			for(int j= i; j<n; j++) {
				if(arr[i].length()>arr[j].length()) {
					tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
				if(arr[i].length() == arr[j].length()) {
					int count = 0;
					while(count != arr[i].length()) {
					int a = (int)arr[i].charAt(count);
					int b = (int)arr[j].charAt(count);
					if(b == a) {
						count++;
					}
					else if(b<a) {
						tmp = arr[j];
						arr[j] = arr[i];
						arr[i] = tmp;
						break;
					}
					else {
						break;
					}
					}
				}
			}
		}
		ArrayList list = new ArrayList();
		for(int i =0; i<arr.length; i++) {
			if(!list.contains(arr[i])) {
				list.add(arr[i]);
				
			}
		}
		for(int i =0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		}

}
