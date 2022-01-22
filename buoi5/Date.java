package buoi5;

import java.util.Scanner;

public class Date {
	private int ngay, thang, nam;
	public Date()
	{
		ngay = 0;
		thang = 0;
		nam = 0;
	}
	public Date(int ngay1, int thang1, int nam1)
	{
		ngay= ngay1;
		thang = thang1;
		nam = nam1;
	}
	public Date( Date d)
	{
		ngay =d.ngay;
		thang = d.thang;
		nam = d.nam;
	}
	public void nhap()
	{
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("nhap ngay: ");
			ngay = sc.nextInt();
			System.out.println("nhap thang: ");
			thang = sc.nextInt();
			System.out.println("nhap nam: ");
			nam = sc.nextInt();
			if(!hople())
			{
				System.out.println("hay nhap lai");
			}
		} while(!hople());

	}
	public boolean hople()
	{
				   //0,1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12
		int max[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if(nam%400==0 ||(nam%4==0 && nam%100!=0)) max[2]=29;
		boolean h = false;
		if(ngay>0 && thang >0 && nam >0 &&thang<13 && ngay<=max[thang])
			h = true;
		return h; 
	}
	
	public void in()
	{
		System.out.println(ngay + "/"+ thang + "/" + nam);
	}
	public String toString()
	{
		return (ngay + "/" + thang+ "/" + nam);
	}
	
	public Date cong()
	{
		Date kq = new Date(ngay, thang, nam);
		kq.ngay++;
		if(!kq.hople())
		{
			kq.ngay = 1;
			kq.thang ++;
			if(!kq.hople())
			{
				kq.thang = 1;
				kq.nam++;
			}
		}
		return kq;
	}
	public Date cong(int n)
	{
		Date kq = new Date(ngay, thang,nam);
		for(int i =0;i<n;i++)
			kq = kq.cong();
		return kq;
	}
	
}
