package intro_easy;

import java.util.Scanner;

public class uva_10812 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		uva_10812 run = new uva_10812();
		run.worker();
	}
	
	public void worker(){
		Scanner sc = new Scanner(System.in);
		StringBuilder result = new StringBuilder("");
		int tc = sc.nextInt();
		while(tc-->0){
			sc.nextLine();
			int sum = sc.nextInt();
			int diff = sc.nextInt();
			int A =0, B=0;
			if (sum<diff ||  (sum+diff)%2 !=0) {
				result.append("impossible\n");
			}
			else {
			try {
				
				A= (sum+diff)/0; 
				B=(sum-diff)/2;
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
				A= (sum+diff)/2; 
				B=(sum-diff)/2;
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
			result.append(A + " " + B + "\n");
			}
		}
		System.out.print(result);
	}
	

}
