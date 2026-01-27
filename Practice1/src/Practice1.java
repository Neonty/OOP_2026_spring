import java.util.Scanner;

public class Practice1
{	
	public static void Task1(String name)
	{
		int n = name.length();
		
		PrintBorder(n);
		System.out.println('|' + name + '|');
		PrintBorder(n);
	}
	
	public static void PrintBorder(int n)
	{
		System.out.print('+');
		for (int i=0;i<n;i++)
		{
			System.out.print('-');
		}
		System.out.println('+');
	}
	
	public static void Task2()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter side length: ");
		double a = scan.nextDouble();
		
		System.out.println("Area: " + a*a);
		System.out.println("Perimeter: " + 4*a);
		System.out.println("Length of diagonal: " + a + "*sqrt(2) or " + (a * Math.sqrt(2)));
		
		scan.close();
	}
	
	public static void Task3()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your points: ");
		double points = scan.nextDouble();
		
		if (points>100)
		{
			System.out.print("Your points can't be higher than 100!");
		}
		else if (points>=95)
		{
			System.out.print("Your grade is A");
		}
		else if (points>=90)
		{
			System.out.print("Your grade is A-");
		}
		else if (points>=85)
		{
			System.out.print("Your grade is B+");
		}
		else if (points>=80)
		{
			System.out.print("Your grade is B");
		}
		else if (points>=75)
		{
			System.out.print("Your grade is B-");
		}
		else if (points>=70)
		{
			System.out.print("Your grade is C+");
		}
		else if (points>=65)
		{
			System.out.print("Your grade is C");
		}
		else if (points>=60)
		{
			System.out.print("Your grade is C-");
		}
		else if (points>=55)
		{
			System.out.print("Your grade is D+");
		}
		else if (points>=50)
		{
			System.out.print("Your grade is D");
		}
		else if (points>=0)
		{
			System.out.print("Your grade is F");
		}
		else
		{
			System.out.print("Your scode can't be negative!");
		}
		
		System.out.println();
		
		scan.close();
	}
	
	public static void Task4()
	{
		Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a: ");
        double a = scan.nextDouble();
        
        System.out.print("Enter b: ");
        double b = scan.nextDouble();
        
        System.out.print("Enter c: ");
        double c = scan.nextDouble();

        double d = (b * b) - (4 * a * c);

        if (d < 0)
        {
            System.out.println("Error: The discriminant is negative (" + d + ").");
            System.out.println("This equation has no real roots.");
        } 
        else if (d == 0)
        {
            double root = (-b / (2 * a));
            System.out.println("Root: " + root);
        }
        else
        {
            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        }

        scan.close();
	}
	
	public static void Task5(double balance, double interestRate)
	{
		double interest = balance * interestRate;
        double newBalance = balance + interest;

        System.out.println("Starting Balance: " + balance + "₸");
        System.out.println("Interest Rate: " + (interestRate * 100) + "%");
        System.out.printf("Interest Added: %.2f%n₸", interest);
        System.out.printf("New Balance: %.2f%n₸", newBalance);
	}
	
	public static void Task6()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter string: ");
		String str = scan.nextLine();
		
		if (IsPalindrome(str))
		{
			System.out.print("The stirng is palindrome!");
		}
		else
		{
			System.out.print("The stirng is not palindrome!");
		}
		
		scan.close();
	}
	
	public static boolean IsPalindrome(String str)
	{
	    int l = 0;
	    int r = str.length() - 1;

	    while (l < r)
	    {
	        if (str.charAt(l) != str.charAt(r))
	        {
	            return false;
	        }
	        
	        l++;
	        r--;
	    }
	    
	    return true;
	}
	
	public static void main(String[] args)
	{
//		Task1("Nurassyl");
		
//		Task2();
			
//		Task3();
		
//		Task4();
		
//		Task5(2750000, 0.05);
		
		Task6();
	}

}
