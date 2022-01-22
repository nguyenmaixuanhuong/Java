package buoi2;

import java.util.Scanner;

public class SSDate {

	public static void main(String[] args) {
		Date d1 = new Date(14,9,2021);
		d1.in();
		Date d2;
		d2= new Date();
		System.out.println("Nhap ngay d2: ");
		d2.nhap();
		System.out.println("Nhap d2: ");
		d2.in();
		Scanner sc = new Scanner (System.in);
		System.out.println("nhap so ngay cong: ");
		int n = sc.nextInt();
		d2 = d2.cong(n);
		System.out.println("ngay d2 sau khi cong: ");
		d2.in();

	}

}
