import java.util.Scanner;
public class TemperatureConversion
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Welcome to the Temperature Conversion Tool!");
		System.out.println("Enter an choice ");
		int choice = scan.nextInt();
		if (choice == 1) 
		{
			System.out.println("Enter the temperature in Celsius");
			double celsius = scan.nextDouble();
			double F = celsiusToFahrenheit(celsius); 
			System.out.println(celsius+"equivalent to "+F);
		}
		else if (choice == 2)
		{
			System.out.println("Enter the temperature in Fahrenheit");
			double fahrenheit = scan.nextDouble();
			double C = fahrenheitTocelsius(fahrenheit);
			System.out.println(fahrenheit +" C equivalent to"+ C);
		}
		else
		{
			System.out.println("Invalid");
		}
	}
		public static double celsiusToFahrenheit(double celsius)
		{
			return (celsius * 9/5) + 32;
		}
		public static double fahrenheitTocelsius(double fahrenheit )
		{
			return (fahrenheit -32)* 5/9;
		}
	}
