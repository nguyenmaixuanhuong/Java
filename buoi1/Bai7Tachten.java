package buoi1;

import java.util.Scanner;

public class Bai7Tachten {
	public static void tachten(String hoten)
	{
		hoten= hoten.trim();
		String ten = hoten.substring(hoten.lastIndexOf(" ")+1,hoten.length());
		System.out.println("ten la:" + " " +ten);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ho ten: ");
		String hoten1 = sc.nextLine();
		Bai7Tachten.tachten(hoten1);
	}

}
