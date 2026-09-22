package basics;

public class ForLoop3 {

	public static void main(String[] args) {
//		print all even numbers between 5 and 102
//		for (int i = 4; i <= 102; i = i + 2) {
//			System.out.println(i);
//		}
		
//		print all even numbers between 5 and 102
		for (int i = 5; i <= 102; i = i + 1) {
			//if the value of i is even, we print it 
			if(102 % 2 == 0) {
				System.out.println(i);
			}
			
		}
	}
}
