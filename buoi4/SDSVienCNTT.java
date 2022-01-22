package buoi4;

import java.util.Scanner;

import buoi3.SinhVien;

public class SDSVienCNTT {

	public static void main(String[] args) {
		//SinhVienCNTT a = new SinhVienCNTT();
		//a.nhap();
		//a.in();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n nhap so sinh vien");
		int n = sc.nextInt();
		SinhVien ds[] = new SinhVien[n];
		int c =0;
		for(int i=0; i<n ; i++)
		{
			System.out.println("\n Nhap sinh vien neu la svCNTT bam phim 1, con khong phai bam phim 0");
			c = sc.nextInt();
			if(c ==0) ds[i] = new SinhVien();
			else ds[i] = new SinhVienCNTT();
			
			ds[i].nhap();
		}
		for(int i=0; i<n; i++)
			System.out.println((i+1+ "-"+ds[i]));
		
		for(int i =0 ;i<n;i++)
			ds[i].dky();
		for(int i =0 ;i<n;i++)
			ds[i].nhapDiem();
		System.out.println("nhap dia chi email sinh vien can tim: ");
		String email = sc.nextLine();
			email = sc.nextLine();
			boolean tim = false;
		for(int i =0 ;i<n;i++)
		{
			if(ds[i].layEmail().equals(email))
				{System.out.println("\n Tai khoan cua sinh vien "+ds[i].layTaiKhoan() + ",ket qua hoc tap: "+ds[i].trungBinh());
			tim = true;
			break;
			}
		}
		if(tim == false) System.out.println("\n Khong tim thay sinh vien nay!");
	}

}
