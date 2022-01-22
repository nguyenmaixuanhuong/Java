package buoi2;

import java.util.Scanner;

public class SSDiem {

	public static void main(String[] args) {
		Diem A = new Diem(3,4);
		System.out.print("Toa do diem A = ");
		A.in();
		Diem B = new Diem();
		B.nhap();
		System.out.print("Toa do diem B = ");
		B.in();
		Diem C = new Diem(-B.layX(), -B.layY());
		System.out.print("Toa do diem C = ");
		C.in();
		System.out.println("Khoang cach BO = " + B.khoangCach());
		System.out.println("Khoang cacnh BA = "+ B.khoangCach(A));
		
		
	}

}
