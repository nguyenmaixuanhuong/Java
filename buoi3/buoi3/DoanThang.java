package buoi3;

import java.util.Scanner;

import buoi2.Diem;

public class DoanThang {
	private Diem d1,d2;
	public DoanThang()
	{
		d1 = new Diem();
		d2 = new Diem ();
	}
	public DoanThang (Diem d11, Diem d22)
	{
		d1= new Diem(d11);
		d2 = new Diem(d22);
	}
	public DoanThang (int x1, int y1, int x2, int y2)
	{
		d1 = new Diem(x1, y1);
		d2 = new Diem(x2, y2);
	}
	public DoanThang (DoanThang dt)
	{
		d1= new Diem(dt.d1);//pthuc xay dung ham sao chep diem
		d2 = new Diem(dt.d2);
	}
	public void nhap()// doan thang
	{
		// Scanner sc = new Scanner(System.in);
		System.out.println("nhap toa do diem dau: ");
		 d1.nhap();// diem
		 System.out.println("nhap toa do diem cuoi: ");
		 d2.nhap();
	}
	public void in()
	{
		System.out.print("[");
		d1.in();
		System.out.print(",");
		d2.in();
		System.out.println("]");
	}
	public String toString()
	{
		return "[" + d1 +"," + d2 +"]";
	}
	public void tinhTien(int dx, int dy)
	{
		d1.tinhTien(dx, dy);
		d2.tinhTien(dx, dy);
	}
	public float khoangCach()
	{
		return d1.khoangCach(d2);
	}
	public Diem trungDiem()
	{
		Diem i = new Diem();
		i.ganX((d1.layX()+ d2.layY())/2);
		i.ganY((d1.layX() + d2.layY())/2);
		return i;
	}
	

}
