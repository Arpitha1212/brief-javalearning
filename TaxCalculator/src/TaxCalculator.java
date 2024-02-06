import java.util.Scanner;

public class TaxCalculator {
public static void main(String[] args) 
{
	Scanner scan = new Scanner (System.in);
	double purchaseamount = scan.nextDouble();
	double taxrate = scan.nextDouble();
	double totalamount =calculateTotalTax(purchaseamount ,taxrate);
	System.out.println("Total cost including tax "+totalamount);
	
}
public static double calculateTotalTax(double purchaseamount ,double taxrate) {
	 double totalamount= (purchaseamount*taxrate)+(purchaseamount);
	return totalamount; 
}
}
