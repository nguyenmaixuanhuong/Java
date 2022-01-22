package buoi1;
import java.util.Scanner;
import java.util.Stack;

public class Bai6SNT
{
	public int snt(int n)
	{
		int dem=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0) {dem++;}
		}
		if(dem!=0) return 1;
		else return 0;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		Stack<Integer> stack = new Stack<Integer>();
		int n = sc.nextInt();
		Bai6SNT t = new Bai6SNT();
			int test = t.snt(n);
		if(test!=1)
		{
			System.out.println("n la so nguyen to");
		}
		else
		{
			System.out.println("n khong la so nguyen to");
		}
		while (n!= 0)
		{
			int d = n%2;
			stack.push(d);
			n/=2;
		}
		while (!(stack.empty()))
		{
			System.out.print(stack.pop());
		}
		
	}
		
}