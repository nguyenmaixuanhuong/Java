package buoi1;

import java.util.Scanner;

public class SDPhanSo {

	public static void main(String[] args) {
		PhanSo a = new PhanSo(3,7);
		PhanSo b = new PhanSo(4,9);
		System.out.print("phan so a = ");
		a.in();
		System.out.print("phan so b = ");
		b.in();
		PhanSo x = new PhanSo();
		System.out.println("nhap phan so x  ");
		x.nhap();
		PhanSo y = new PhanSo();
		System.out.println("nhap phan so y  ");
		y.nhap();
		System.out.print("tong x+y = ");
		 x.congPhanSo(y);
		 x.chiaPhanSo(y);
		 x.nhanPhanSo(y);
		 x.truPhanSo(y);
		 x.lonHon(y);
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
	
		PhanSo ds[] = new PhanSo[n];
		
		for(int i=0;i<ds.length;i++)
		{
			ds[i] = new PhanSo();
		
		}
		for(int i=0;i<ds.length;i++)
		{
			System.out.println("nhap phan tu thu "+(i+1));
			ds[i].nhap();
		
		}
		PhanSo tong = new PhanSo();
		for(int i=0;i<ds.length;i++)
		{
			tong.congPhanSo(ds[i]);
			
		}
		System.out.print("tong n phan so la ");
		tong.in();
		PhanSo max = new PhanSo();
	}
}
		
	


