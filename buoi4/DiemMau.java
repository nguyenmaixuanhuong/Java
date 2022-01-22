package buoi4;

import java.util.Scanner;

import buoi2.Diem;

public class DiemMau extends Diem {
	private String mau;
	
	public DiemMau()
	{
		super(); // Diem()  {x=y=0}
		mau = new String();
	}
	public DiemMau(int x1, int y1, String c1)
	{
		super(x1,y1); // Diem(int x1, int y1)
		mau = new String(c1);
	}
	public DiemMau(DiemMau dm)
	{
		super((Diem) dm); // Diem(Diem) 
		mau = new String(dm.mau);
	}
	public void nhap()
	{
		Scanner sc = new Scanner(System.in);
		super.nhap();//Diem.nhap()
		System.out.println("\n Nhap mau: ");
		mau = sc.nextLine();
	}
	public void in()
	{
		super.in();//Diem.in()
		System.out.println(", mau: "+ mau);
	}
	public String toString()
	{
		return super.toString() + ", mau: "+ mau;
	}
	public void ganMau(String c1)
	{
		mau = new String(c1);
	}
	

	

}
