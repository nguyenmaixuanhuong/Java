package buoi1;

import java.util.Scanner;

public class PhanSo {
	private int tu;
	private int mau;
	
	public PhanSo()
	{
		tu=2;
		mau=2;
	}
	public PhanSo(int tu1, int mau1)
	{
		tu=tu1;
		mau=mau1;
	}
	public void nhap()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap tu so ");
		tu = sc.nextInt();
		do {
			System.out.print("nhap mau so");
		mau = sc.nextInt();
		if(mau==0)
		{
			System.out.println("mau so khong hop le. Xin moi nhap lai");
		}
		}while(mau== 0);
		
		
	}
	public void in()
	{
		if(tu==0)
		{
			System.out.print("0");
		}
		else if(mau==1)
		{
			System.out.println(tu);
		}
		else
		{
			System.out.println(tu+"/"+mau);
		}
	}
	public void nghichDao()
	{
		int t;
		t=tu;
		tu=mau;
		mau=t;
	}
	public PhanSo giatringhichDao(PhanSo kq)
	{
		kq.tu=mau;
		kq.mau=tu;
		return kq;

	}
	public float gtriThuc()
	{
		return tu/mau;
	}
	public boolean lonHon (PhanSo a)
	{
		boolean h = false;
		if((long)tu*a.mau>(long)mau*a.tu)
		{
			h=true; 
		}
		return h;
	}
	int UCLN(int a, int b)
	{
		int uc;
		if(a<b) uc=a;
		else uc=b;
		while(a%uc!=0 || b%uc!=0)
		{
			uc--;
		}return uc;
	}
	public void  rutGon()
	{
		int t = UCLN(tu,mau);
		tu/=t;
		mau/=t;
	}
	public void congPhanSo(PhanSo ps)
	{
		int a =(tu*ps.mau)+(mau*ps.tu);
		int b =mau*ps.mau;
		PhanSo k= new PhanSo(a,b);
		k.rutGon();
		System.out.println(k.tu+"/"+k.mau);
	}
	public void truPhanSo(PhanSo ps)
	{
		int a =(tu*ps.mau)-(mau*ps.tu);
		int b =mau*ps.mau;
		PhanSo k= new PhanSo(a,b);
		k.rutGon();
		System.out.println("ket qua tru hai phan so = "+k.tu+"/"+k.mau);
	}
	public void nhanPhanSo(PhanSo ps)
	{
		int a = tu*ps.tu;
		int b= mau*ps.mau;
		PhanSo k = new PhanSo(a,b);
		k.rutGon();
		System.out.println("ket qua nhan hai phan so = "+k.tu+"/"+k.mau);
	}
	public void chiaPhanSo(PhanSo ps)
	{
		int a = tu*ps.mau;
		int b = mau*ps.tu;
		PhanSo k = new PhanSo(a,b);
		k.rutGon();
		System.out.println("ket qua chia hai phan so = "+k.tu+"/"+k.mau);
	}
	public void congSoNguyen(int p)
	{
		int a = p*mau+tu;
		int b = mau;
		PhanSo k= new PhanSo(a,b);
		k.rutGon();
		System.out.println("ket qua cong voi so nguyen = "+k.tu+"/"+k.mau);
	}
	public void truSoNguyen(int p)
	{
		int a =-p*mau+tu;
		int b =mau;
		PhanSo k= new PhanSo(a,b);
		k.rutGon();
		System.out.println("ket qua tru voi so nguyen = "+k.tu+"/"+k.mau);
	}
	public void chiaSoNguyen(int p)
	{
		int a = tu;
		int b= mau*p;
		PhanSo k = new PhanSo(a,b);
		k.rutGon();
		System.out.println("ket qua chia voi so nguyen = "+k.tu+"/"+k.mau);
	}
	public void nhanSoNguyen(int p)
	{
		int a = tu *p;
		int b = mau;
		PhanSo k = new PhanSo(a,b);
		k.rutGon();
		System.out.println("ket qua nhan voi so nguyen = "+k.tu+"/"+k.mau);
	}
	
	
	
	
	
	

}
