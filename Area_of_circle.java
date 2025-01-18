import java.util.*;
public class Area_of_circle
{
    public static void main(String [] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the radius:");
	int radius= sc.nextInt();
	
	double area;
	double pi =3.14 ;
	
	area= (pi * (radius^2));
	System.out.println("Area of circle is:" +area);
	}
}