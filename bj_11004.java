import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;
public class bj_11004 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		st = new StringTokenizer(br.readLine()); // 얘 없으면 왜 안돌아감?
		for(int i = 0; i< n; i++) {
			int a =Integer.parseInt(st.nextToken());
			list.add(a);
		}
		Collections.sort(list);
		bw.write((int)list.get(k-1)+"\n");	
		bw.flush();
	}

}
