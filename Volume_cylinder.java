import java.util.*;
public class Volume_cylinder
{
    public static void main(String [] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the radius:");
	int radius= sc.nextInt();
	
	System.out.println("Enter the height:");
	int height= sc.nextInt();
	
	double pi=3.14;
	double volume =(pi*(radius^2)*height);
	System.out.println("Volume of cylinder is:" +volume);
	}
}