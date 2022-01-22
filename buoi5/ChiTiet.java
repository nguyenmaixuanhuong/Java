package buoi5;

import java.util.Scanner;

public class ChiTiet {
	private int sluong;
	private float dgia;
	
	private HangHoa h;
	
	public ChiTiet()
	{
		h = new HangHoa();
		dgia = 0.0f;
		sluong = 0;
	}
	public ChiTiet(HangHoa h1, float d, int sl)
	{
		h = new HangHoa(h1);
		dgia = d;
		sluong = sl;
	}
	
	public ChiTiet(ChiTiet c)
	{
		h = new HangHoa(c.h);
		dgia = c.dgia;
		sluong = c.sluong;
	}
	
	public void nhap()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thong tin hang hoa: ");
		h.nhap();
		System.out.println("Nhap so luong hang hoa:");
		sluong = sc.nextInt();
		System.out.println("Nhap don gia cua hang hoa: ");
		dgia = sc.nextFloat();
	}
	
	public void in()
	{
		System.out.println(h + ", so luong: "+sluong+ ", don gia: "+dgia);
		
	}
	
	public String toString()
	{
		return (h + ", so luong: "+sluong+ ", don gia: "+dgia);
		
	}
	public  int laySLuong() {
		return sluong;
	}
	
	public  float layDGia() {
		return dgia;
	}
}
