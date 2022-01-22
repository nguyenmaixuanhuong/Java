package buoi3;

import java.util.Scanner;

import buoi2.Date;

public class SinhVien {
	private String mssv, hten;
	private Date nsinh;
	
	private int sl, max;
	private String tenHP[], diemHP[];
	
	public SinhVien()
	{
		mssv = new String();
		hten = new String();
		nsinh = new Date();
		sl =0;
		max = 60;
		tenHP = new String[max];
		diemHP = new String[max];
		
	}
	public SinhVien(int max1)
	{
		mssv = new String();
		hten = new String();
		nsinh = new Date();
		sl =0;
		max = max1;
		tenHP = new String[max];
		diemHP = new String[max];
		
	}
	public SinhVien(String mssv1, String hten1, Date nsinh1)
	{
		mssv = new String(mssv1);
		hten = new String(hten1);
		nsinh = new Date(nsinh1);
		sl =0;
		max = 60;
		tenHP = new String[max];
		diemHP = new String[max];
		
	}
	public SinhVien(SinhVien s)
	{
		mssv = new String(s.mssv);
		hten = new String(s.hten);
		nsinh = new Date(s.nsinh);
		sl =s.sl;
		max = s.max;
		tenHP = new String[max];
		diemHP = new String[max];
		for(int i =0;i<sl;i++)
		{
			tenHP[i] = new String(s.tenHP[i]);
			diemHP[i] = new String(s.diemHP[i]);
			
		}
	}
	public void nhap()
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhap ma so svien: ");
		mssv = sc.nextLine();
		System.out.println("Nhap ho ten svien: ");
		hten = sc.nextLine();
		System.out.println("Nhap ngay sinh svien: ");
		nsinh.nhap();
		
	}
	public void in()
	{
		System.out.print("["+mssv +","+hten + ","+nsinh);
		for(int i =0; i<sl ; i++)
		{
			System.out.print("," + tenHP[i] + ":" + diemHP[i]);
			
			
		}
		System.out.print("]");
	}
	public String toString()
	{
		String s = ("["+mssv +","+hten + ","+nsinh);
		for(int i =0; i<sl ; i++)
		{
			s+= ("," + tenHP[i] + ":" + diemHP[i]);
			s+= ("]");
		}
		
		return s;
	}
	public void them(String ten, String diem)
	{
		if(sl< max-1)
		{
			tenHP[sl] = new String(ten);
			diemHP[sl] = new String(diem);
			sl++;
		}
		else System.out.println("Ban khong the them vi mang day");
	}
	public void xoa(String ten)
	{
		int i =0;
		for(i =0; i<sl;i++)
		{
			if(tenHP[i].contentEquals(ten)) break;
		}
		if(i<sl)
		{
			for(int k =i ;k<sl-1 ; k++)
			{
				tenHP[k] = tenHP[k+1];
				diemHP[k] = diemHP[k+1];
			}
			sl--;
		}
	}
	public void dky()
	{
		Scanner sc = new Scanner(System.in);
		String ten = ""; // new String()
		System.out.println("Nhap cac mon hoc can dang ky, kthuc bang stop");
		do {
			System.out.println("Nhap ten mon: ");
			ten = sc.nextLine();
			if(ten.equals("stop")) break;
			them(ten,"");	
		}while(true);
	}
	public void nhapDiem()
	{
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<sl;i++)
		{
			System.out.println("Nhap diem mon "+ tenHP[i]+":");
			diemHP[i] = sc.nextLine();
		}
		
	}
	public float trungBinh()
	{
		float d = 0.0f;
		for(int i=0; i<sl;i++)
		{
			if(diemHP[i].equals("A")) d+= 4.0f;
			else if (diemHP[i].equals("B+")) d+= 3.5f;
			else if (diemHP[i].equals("B")) d+= 3.0f;
			else if (diemHP[i].equals("C+")) d+= 2.5f;
			else if (diemHP[i].equals("C")) d+= 2.0f;
			else if (diemHP[i].equals("D+")) d+= 1.5f;
			else if (diemHP[i].equals("D")) d+= 1.0f;
		
		}
		return (d/sl);
	}
	public String layMssv()
	{
		return mssv;
	}
	public String layTen()
	{
		String ten = hten.substring(hten.trim().lastIndexOf(" ") +1);
		return ten;
	}
	
	
}
