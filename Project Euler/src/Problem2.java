
public class Problem2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] set;
		set = new int[32];
		set[0] = 1;
		for(int i = 1; i<set.length; i++){
			set[i] = i+1;
		}
		int[] fibonacci;
		fibonacci = new int[32];
		fibonacci[0] = 1;
		fibonacci[1] = 2;
		for(int k=2; k<fibonacci.length; k++ ){
			fibonacci[k] = (fibonacci[k-2]) + (fibonacci[k-1]);
		}
		int sum = 0; 
		for(int j = 0; j<fibonacci.length; j++){
			if (fibonacci[j] % 2 == 0){
				sum = sum + fibonacci[j];
			}
		}
		System.out.println(sum);
	}

}
