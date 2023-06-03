import java.io.*;
import java.util.*;
class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<>();
		for(int i=0; i<N; i++) set.add(br.readLine());
		String[] arr = set.toArray(new String[0]);
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i].length()>arr[j].length()) {
					String tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				} else if(arr[i].length()==arr[j].length() && arr[i].compareTo(arr[j])>0) {
					String tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for(String str : arr) {
			bw.write(str + "\n");
		}
		bw.flush(); bw.close();
	}
}