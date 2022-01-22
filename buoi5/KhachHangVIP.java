package buoi5;

import java.util.Scanner;

public class KhachHangVIP extends KhachHang {
	private float tLeGiam ;
	private Date d;
	
	public KhachHangVIP()
	{
		super();
		tLeGiam = 0.0f;
		d = new Date();
	}
	
	public KhachHangVIP(KhachHang k, float t, Date n)
	{
		super(k);
		tLeGiam = t;
		d = new Date(n);
	}
	
	public KhachHangVIP(KhachHangVIP k)
	{
		super((KhachHang) k);
		tLeGiam = k.tLeGiam;
		d = new Date(k.d);
	}
	
	public void nhap()
	{
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ti le giam: ");
		tLeGiam = sc.nextFloat();
		System.out.println("nhap ngay khach hang tro thanh VIP: ");
		d.nhap();
	}
	
	public void in()
	{
		super.in();
		System.out.println(", ti le giam: "+tLeGiam +", nam tro thanh VIP"+d );
	}
	
	public String toString()
	{
		return super.toString()+ (", ti le giam: "+tLeGiam +", nam tro thanh VIP"+d );
	}
	public float layTLeGiam() {
		return tLeGiam;
	}
}
