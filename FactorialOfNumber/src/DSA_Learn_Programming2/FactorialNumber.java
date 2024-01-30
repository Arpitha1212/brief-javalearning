package DSA_Learn_Programming2;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		System.out.println("Factorial of the given number: "+Factorial(num));
	}
	static int Factorial(int num) {
		if(num<=0) {
			return 1;
		}
		return num*Factorial(num-1);
	}
}
