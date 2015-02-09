import java.math.BigInteger; 
public class Problem5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = false;
		int res = 2521;
		while(!flag){
			for(int i = 2; i<21; i++){
				if(res % i !=0){
					res++;
					break;
				}
				if(i==20){
					flag = true;
				}
			}
		}
		System.out.println(res);	
		}
		
			
			
		}
		
		


