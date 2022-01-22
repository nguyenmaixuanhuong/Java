package buoi1;

import java.util.Scanner;

public class Bai8Danhsach {
	int ds[];
	int n;
	public void nhap()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so phan tu");
		n= sc.nextInt();
		ds = new int[n];
		for(int i=0;i<ds.length;i++)
		{
			System.out.println("nhap phan tu thu "+(i+1));
			ds[i]=sc.nextInt();
		}
		
	}
	public int dem(int x)
	{
		int d=0;
		for(int e: ds)
		{
			if(e==x) d++;
		}
		return d;
	}
	public void Sapxep()
	{
		int t;
		for(int i=0;i<=ds.length-1;i++)
			for(int j=i+1;j<ds.length;j++)
			{
				if(ds[i]>ds[j])
				{
					t=ds[i];
					ds[i]=ds[j];
					ds[j]=t;
					
				}
			}
	}
	public void in()
	{
		for(int e : ds)
			System.out.print(e+" ");
	}
	public static void main(String[] args) {
		Bai8Danhsach d = new Bai8Danhsach();
		d.nhap();
		d.in();
		d.Sapxep();
		System.out.print("\nday so duoc sap xep lai: ");
		d.in();
		Scanner sc = new Scanner(System.in);
		System.out.println("\nnhap so can dem x =");
		int x = sc.nextInt();
		System.out.println("so lan x xuat hien "+ d.dem(x));
	}

}
