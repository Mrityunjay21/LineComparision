
public class Line {

	static void identical(double m1,double n1,
			double p1,double m2,
			double n2,double p2 ) 
	{
		if ((m1/m2==n1/n2)
			&& (n1/n2==p1/p2)
			&&(p1/p2==m1/m2))
			System.out.println("The line is equal ");
		    
		else 
			System.out.println("The line is not equal");
		
	}
	public static void main(String[]args)
	{
		double m1 = 2, n1=4,
				p1 = 3, m2 = 3,
				n2 = 3, p2 = 3;
		identical(m1,n1,p1,m2,n2,p2);
	}
	 
	{
	}
	}
