
public class Problem6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Sum of the squares
		int naturalNumber = 100;
		int secondNumber = 100;
		int sum = 0;
		int square = 0;
		int add = 0;
		
		while(naturalNumber != 0){
			square = naturalNumber * naturalNumber;
			sum = sum + square;
			naturalNumber--;
		}
		
		while(secondNumber != 0 ){
			add = add + secondNumber;
			secondNumber--;
		}
		add = add * add;
		System.out.println(add - sum);
		
	}

}
