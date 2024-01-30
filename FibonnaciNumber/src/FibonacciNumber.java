
public class FibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		System.out.println("Fibonacci of "+num+"th value: " +Fibo(num));

	}
	static int Fibo(int num) {
		if(num<=1) {
			return 1;
		}
		return Fibo(num-1)+Fibo(num-2);
	}

}
