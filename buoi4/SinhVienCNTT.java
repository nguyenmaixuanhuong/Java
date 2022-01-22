package buoi4;

import java.util.Scanner;

import buoi3.SinhVien;

public class SinhVienCNTT extends SinhVien {
	private String tkhoan, mkhau, email;
	
	public SinhVienCNTT()
	{
		super(); //SinhVien();
		tkhoan = new String();
		mkhau = new String();
		email = new String();
	}
	public SinhVienCNTT(SinhVienCNTT s)
	{
		super(s); //SinhVien();
		tkhoan = new String(s.tkhoan);
		mkhau = new String(s.mkhau);
		email = new String(s.email);
	}
	public void nhap()
	{
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Nhap tai khoan:");
		tkhoan = sc.nextLine();
		System.out.println("\n Nhap mat khau:");
		mkhau = sc.nextLine();
		System.out.println("\n Nhap email:");
		email = sc.nextLine();
	}
	public void in()
	{
		super.in();
		
		System.out.println(","+ tkhoan + "," + email+ "]");
	}
	public String toString()
	{
		return super.toString()+","+ tkhoan + "," + email +"]";
		
	}
	public void doiMatKhau(String newpass)
	{
		mkhau = new String(newpass);
	}
	public String layEmail()
	{
		return email;
	}
	public String layTaiKhoan()
	{
		return tkhoan;
	}
}
