package ds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class uva_10226 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		br.readLine();
		try {
			for(int i=0;i<tc;i++){
				int count = 0;
				String tempStr;
				if (i>0) System.out.println();
				TreeMap <String, Integer> treeSpecies = new TreeMap<String, Integer>();
				while((tempStr =br.readLine())!=null){
					tempStr=tempStr.trim();
					if(tempStr.equals("")) 
						{
						break;
						}
					else {
					
					if(treeSpecies.containsKey(tempStr)) {
						int value = treeSpecies.get(tempStr);
						treeSpecies.put(tempStr, value+1);
					}
					else
						treeSpecies.put(tempStr, 1);
					}
					count++;
				}
				for(Map.Entry<String,Integer> entry : treeSpecies.entrySet()) {
					  String key = entry.getKey();
					  Integer value = entry.getValue();
					  double percentage = (double)value * 100.00 /count;
					   System.out.println(key + " "  +   String.format("%.4f",percentage));
					}
			}
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
