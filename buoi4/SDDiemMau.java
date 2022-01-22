package buoi4;

import buoi2.Diem;

public class SDDiemMau {

	public static void main(String[] args) {
		DiemMau A = new DiemMau(5,10,"Trang");
		A.in();
		System.out.println("\n Toa do A: "+A);
		
		DiemMau B = new DiemMau();
		B.nhap();
		System.out.println("\n Toa do B: "+B);
		B.tinhTien(10, 8);
		System.out.println("\n Toa do B: "+B);
		B.ganMau("Vang");
		System.out.println("\n Toa do B: "+B);
		
		
		

	}

}
