import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class uva_11849_jack_and_jill {
	public static void main(String[] args) {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		try {
			String[] sb = bfr.readLine().split(" ");
			StringBuilder sbr = new StringBuilder();
			int jack = Integer.parseInt(sb[0]);
			int jill = Integer.parseInt(sb[1]);
			while(jack!=0 && jill!=0){

				int  jackctr=0;
				int jillctr=0;
				int result=0;
				TreeSet<Integer> jackCds = new TreeSet<Integer>();
				
				while(jackctr<jack){
					jackCds.add(Integer.parseInt(bfr.readLine()));
					jackctr++;
				}
				while(jillctr<jill){
					if (jackCds.contains(Integer.parseInt(bfr.readLine()))) result++;
					jillctr++;
				}
				sbr.append(result +"\n");
				sb=bfr.readLine().split(" ");
				jack = Integer.parseInt(sb[0]);
				jill = Integer.parseInt(sb[1]);
			}
			System.out.print(sbr);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
