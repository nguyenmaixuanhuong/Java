package buoi5;

import java.util.Scanner;

import buoi3.SinhVien;
import buoi4.SinhVienCNTT;

public class SDHoaDon {

	public static void main(String[] args) {
		/*HoaDon h = new HoaDon();
		h.nhap();
		h.in();*/
		Scanner sc = new Scanner(System.in);
		System.out.println("\n nhap so hoa don");
		int n = sc.nextInt();
		HoaDon ds[] = new HoaDon[n];
		int c =0;
		for(int i=0; i<n ; i++)
		{
			System.out.println("\n Nhap Hoa don thu"+(i+1));
			ds[i] = new HoaDon();
			
			ds[i].nhap();
		}
		
		System.out.println("\n Danh sach hoa don vua nhap: ");
		for(int i=0; i<n; i++)
			System.out.println((i+1+ "-"+ds[i]));
		
		
	}

}
