import java.util.*;
public class Temperature_conversion
{
    public static void main(String [] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter temperature in celcius:");
	float celcius = sc.nextInt();
	
	float fahrenheit;
	
	fahrenheit = ((celcius * 9/5) + 32) ;
	System.out.println("Temperature in Fahrenheit is:" +fahrenheit);
	}
}
	
	
	
	