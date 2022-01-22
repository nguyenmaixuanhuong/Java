package buoi5;

import java.util.Scanner;

public class HoaDon {
	private String mso, tde, nvien;
	
	private Date nlap;
	private KhachHang k;
	private ChiTiet c[];
	private int sl;
	
	public HoaDon()
	{
		mso = new String();
		tde = new String();
		nvien = new String();
		nlap = new Date();
		k = new KhachHang();
		c = new ChiTiet[20];
		sl = 0;
	}
	
	public HoaDon(HoaDon h)
	{
		mso = new String(h.mso);
		tde = new String(h.tde);
		nvien = new String(h.nvien);
		nlap = new Date(h.nlap);
		k = new KhachHang(h.k);
		c = new ChiTiet[h.c.length];
		sl = h.sl;
		for(int i=0 ;i<sl; i++)
		{
			c[i] = new ChiTiet(h.c[i]);
		}
	}
	
	public void nhap()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so hoa don: ");
		mso = sc.nextLine();
		System.out.println("Nhap tieu de hoa don: ");
		tde = sc.nextLine();
		System.out.println("Nhap ten nvien hoa don: ");
		nvien = sc.nextLine();
		
		System.out.println("Nhap ngay lap hoa don: ");
		nlap.nhap();
		
		int s = 0;
		System.out.println("Nhap thong tin khach hang(0) hay Khach hang VIP(1) ");
		s = sc.nextInt();
		if(s==0) k = new KhachHang();
		else k = new KhachHangVIP();
		k.nhap();
		
		
		System.out.println("Nhap so luong chi tiet hang hoa: ");
		sl = sc.nextInt();
		for(int i = 0;i<sl ; i++) {
			System.out.println("Nhap chi tiet thu "+(i+1));
			c[i] = new ChiTiet();
			c[i].nhap();
		}
			
	}
	
	public void in()
	{
		System.out.println(mso + ", "+ tde +"\n Nguoi lap hoa don" + nvien + "\n Ngay lap: "+nlap + "\n Khach hang: "+k);
		System.out.println("\n Cac chi tiet hoa don: ");
		for(int i =0;i<sl;i++ )
		{
			System.out.println("\n + "+(i+1)+c[i]);
		}
		System.out.println("\n Tong so tien: "+tong());
	}
	
	public String toString()
	{
		String s = ("{"+ mso+", "+ tde +"\n Nguoi lap hoa don" + nvien + 
		"\n Ngay lap: "+nlap + "\n Khach hang: "+k);
		s+= ("\n Cac chi tiet hoa don: ");
		for(int i =0;i<sl;i++ )
		{
			s+=("\n + "+(i+1)+c[i]);
		}
		s+=("\n Tong so tien: "+tong());
		
		return s;
	}
	
	public float tong()
	{
		float t = 0.0f;
		for(int i=0;i<sl;i++)
		{
			t+= c[i].laySLuong() * c[i].layDGia();
		}
		t = t - t*k.layTLeGiam();
		
		return t;
	}
	
	
	
	
}
