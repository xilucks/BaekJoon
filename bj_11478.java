
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
public class bj_11478 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String str = st.nextToken();
		int count = 0;

		for(int i = 0; i < str.length(); i++) {
			for(int j=i;j<str.length();j++) {
				String values = str.substring(i+1);
				String value = str.substring(i,j+1);
				if(! values.contains(value)) count++;		
			}
		}
		System.out.println(count);
	}

}
