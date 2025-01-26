import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//사람의 수
		int N = Integer.parseInt(br.readLine());
		//각 사람마다 인출되는 걸리는 시간
		int[] P = new int[N];
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		//인출시간배열 입력해주고
		for(int i=0; i<N; i++) {
			
			P[i] = Integer.parseInt(st.nextToken());
		}
		
		//각각 인출시간배열 오름차순으로 정렬해주고
		Arrays.sort(P);
		
		//앞사람포함해서 전체인출시간배열
		int[] arr = new int[N];
		
		arr[0] = P[0];
		
		for(int i=1; i<N; i++) {
			arr[i] = arr[i-1] + P[i]; 
		}
		
		int sum = 0;
		for(int i : arr) sum += i;
		System.out.println(sum);
		
		
	}

}