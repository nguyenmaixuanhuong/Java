package buoi1;
import java.util.Scanner;
public class PTbac2 {
	public static void Ptbac1(float a, float b) {
		float x;
		x=-b/a;
		System.out.println("x="+x);
	}
	public static void Ptbac2(float a, float b, float c)
	{
		if(a==0) { PTbac2.Ptbac1(b,c);}
		else {
			float denta;
			denta=(b*b)-(4*a*c);
			if(denta<0) { System.out.println("phuong trinh vo nghiem");}
			else if(denta==0) {
				float x = -b/2*a;
				System.out.println("phuong trinh co nghiem x ="+x);
			}
			else {
				float x1 =(float) (-b+Math.sqrt(denta))/2*a;
				float x2 =(float) (-b-Math.sqrt(denta))/2*a;
				System.out.println("phuong trinh co nghiem x1= "+x1+ " "+"x2 = "+x2);
				
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("nhap a b c ");
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		PTbac2.Ptbac2(a, b, c);
		
	}
}

	



