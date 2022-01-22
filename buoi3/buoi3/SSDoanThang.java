package buoi3;

import java.util.Scanner;

import buoi2.Diem;

public class SSDoanThang {

	public static void main(String[] args) {
		Diem A  = new Diem(2,5);
		Diem B = new Diem(20,35);
		DoanThang AB = new DoanThang(A,B);
		DoanThang dt = new DoanThang(AB);
		DoanThang CD = new DoanThang();
		
		DoanThang t = AB;
		System.out.println(" Toa do doan thang AB:" + AB);
		System.out.println(" Nhap doan thang CD");
		CD.nhap();
		System.out.println("Tinh tien doan thang CD(5,3)");
		CD.tinhTien(5, 3);
		CD.in();
		System.out.format("Do dai CD = %.2f",CD.khoangCach());
		System.out.println(" Nhap so doan thang:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		DoanThang ds[] = new DoanThang[n];
		for(int i=0; i<ds.length;i++)
		{
			ds[i] = new DoanThang();
		}
		for(int i=0; i<ds.length;i++)
		{
			System.out.println("Nhap doan thang thu "+(i+1)+":");
			ds[i].nhap();
		}
		for(int i=0; i<ds.length;i++)
		{
			System.out.println("Doan thang thu "+(i+1)+":");
			ds[i].in();
		}
		

	}

}
