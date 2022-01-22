package buoi1;

import java.util.Scanner;

public class Date {
	private int ngay, thang, nam;
	public Date()
	{
		ngay = 20;
		thang = 11;
		nam = 2021;
	}
	
	public Date(int d, int m, int y)
	{
		ngay = d;
		thang = m;
		nam = y;
	}
	
	public Date(Date c)
	{
		ngay = c.ngay;
		thang = c.thang;
		nam = c.nam;
	}
	
	public boolean hople()
	{
		int max[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if(nam%400== 0 || (nam%4==0 && nam %100!=0)) max[2] =29;
		boolean h = false;
		if(ngay>0 && thang > 0 && thang < 13 && ngay<=max[thang])
				h = true;
		return h;
	}
	
	public void nhap()
	{
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("nhap ngay: ");
			ngay = sc.nextInt();
			System.out.println("nhap thang: ");
			thang = sc.nextInt();
			System.out.println("nhap nam: ");
			nam = sc.nextInt();
		}while(hople());
		
	}
	
	public void in()
	{
		System.out.println("["+ngay+"/"+thang+"/"+nam+"]");
	}
	public String toString()
	{
		return("["+ngay+"/"+thang+"/"+nam+"]");
	}
	
	public Date cong()
	{
		Date t = new Date(ngay,thang,nam);
		t.ngay++;
		if(!t.hople())
		{
			t.ngay=1;
			t.thang++;
			if(!t.hople())
			{
				t.ngay=1;
				t.thang=1;
				t.nam++;
			}
		}
		return t;
	}
	
	public Date cong(int n)
	{
		Date t = new Date(ngay,thang,nam);
		for(int i=0;i<n;i++)
		{
			
			t= t.cong();
		}
		return t;
	}
	

}
