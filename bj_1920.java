import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class bj_1920{
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i =0; i<n; i++) {
			list.add(sc.nextInt());
			
		}
		int m =sc.nextInt();
		for(int i = 0; i<m; i++) {
			int num = sc.nextInt();
			if(list.contains(num)) {
				bw.write("1\n");
			}
			else {
				bw.write("0\n");
			
			}
		}
		bw.flush();
		
	}
}