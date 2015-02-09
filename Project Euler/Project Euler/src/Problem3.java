
public class Problem3 {

	/**
	 * The prime factors of 13195 are 5, 7, 13 and 29.
	What is the largest prime factor of the number 600851475143 ?
	 */
	public static void main(String[] args) {
		long n = 600851475143L;
		
		// Start point 
		long a = (long) Math.ceil(Math.sqrt(n));
		long b = a*a - n; 
		
		//make sure b is a perfect square
		while((double) Math.sqrt(b) % 1 != 0){
			a = a+1;
			b = a*a - n;
		}
		
		// b = (int) Math.sqrt(b); Automatically finds root of b
		long factorOne = a + (long) Math.sqrt(b);
		long factorTwo = a - (long) Math.sqrt(b);
		
	
		// find all the factors
		/*while(factorOne != n) {
			//System.out.println("There are more factors."); 
			a = a+1;
			b = a*a - n;
			while((double) Math.sqrt(b) % 1 != 0){
				a = a+1;
				b = a*a - n;
				}
			factorOne = a + (int) Math.sqrt(b);
			factorTwo = a - (int) Math.sqrt(b);		
		} */
		
		
		System.out.println(factorOne);
		System.out.println(factorTwo);
		if(factorOne > factorTwo) System.out.println(factorOne);
		else{ System.out.println(factorTwo);} 
		}
}
