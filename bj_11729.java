import java.util.Scanner;
import java.io.*;

public class bj_11729 {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static void hanoi(int n, char x, char y, char z) throws IOException{
		if(n == 1) {
			bw.write(x+" "+z+"\n");
			
			}
		else {
			hanoi(n-1, x, z, y);
			hanoi(1, x, y, z);
			hanoi(n-1,y, x ,z);
		}
	}
	/*static int hanoi(int n) {
		if(n == 1) {
			return 1;
		}
		else {
			return hanoi(n-1)*2+1;
		}
	}*/


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		bw.write((int) (Math.pow(2, a)-1)+"\n");
		hanoi(a,'1','2','3');	
		bw.flush();
		bw.close();
	}
}
