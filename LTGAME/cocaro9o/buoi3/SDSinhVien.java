package buoi3;

import java.util.Scanner;

public class SDSinhVien {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so sinh vien: ");
		int n = sc.nextInt();
		SinhVien ds[] = new SinhVien[n];
		for(int i =0; i<n ; i++)
		{
			ds[i] = new SinhVien();
		}
		System.out.println("Nhap danh sach sinh vien:");
		for(int i =0 ;i<n ;i++)
		{
			System.out.println("Nhap thong tin sinh vien thu :" +(i+1)+":");
			ds[i].nhap();
		}
		System.out.println("In danh sach sinh vien:");
		for(int i =0 ;i<n ;i++)
		{
			System.out.println("Thong tin sinh vien thu :" +(i+1)+":");
			ds[i].in();
		}
		System.out.println("\n Dang ki cho svien");
		for(int i =0 ;i<n ;i++)
		{
			System.out.println("Dang ky sinh vien thu :" +(i+1)+":");
			ds[i].dky();
		}
		System.out.println("\n Nhap diem cho svien");
		for(int i =0 ;i<n ;i++)
		{
			System.out.println("Nhap diem sinh vien thu :" +(i+1)+":");
			ds[i].nhapDiem();
		}
		System.out.println("\n Bang diem mon hoc cho svien");
		for(int i =0 ;i<n ;i++)
		{
			System.out.println("\n" + ds[i]+ds[i].trungBinh());

		}
		System.out.println("\n Danh sach sinh vien bi canh bao hoc vu:");
		for(int i =0 ;i<n ;i++)
		{
			if(ds[i].trungBinh()<1)
				{System.out.println("\n" + ds[i]+ds[i].trungBinh());}
		}
		System.out.println("\n Nhap ma so sinh vien can tim kiem");
		String ms = sc.nextLine();
		for(int i =0 ;i<n ;i++)
		{
			if(ds[i].layMssv().equals(ms))
				System.out.println("\n" + ds[i]+ds[i].trungBinh());
		}
		

	}
}
