package buoi5;

import java.util.Scanner;

public class HangHoa {
	private String mso;
	private String ten;
	private String nsxuat;
	
	
	public HangHoa()
	{
		mso = new String();
		ten = new String();
		nsxuat = new String();
	}
	
	public HangHoa(String m, String t, String nsx)
	{
		mso = new String(m);
		ten = new String(t);
		nsxuat = new String(nsx);
		
	}
	
	public HangHoa(HangHoa k)
	{
		mso = new String(k.mso);
		ten = new String(k.ten);
		nsxuat = new String(k.nsxuat);
	}
	
	public void nhap()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Nhap ma so hang hoa: ");
		mso = sc.nextLine();
		System.out.println("\n Nhap ten hang hoa: ");
		ten = sc.nextLine();
		System.out.println("\n Nhap nha san xuat hang hoa: ");
		nsxuat = sc.nextLine();
	}
	
	public void in()
	{
		System.out.println("["+mso + "," + ten +","+ nsxuat + "]");
	}
	public String toString()
	{
		return("["+mso + "," + ten +","+ nsxuat + "]");
	}
	
	

}
