package basic.dev;

import java.util.Iterator;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person arr[] = new Person[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao 5 nguoi");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Nhap vao nguoi thu: " + (i+1));
			arr[i] = new Person();
			arr[i].name = sc.nextLine();
			arr[i].old = sc.nextInt();
			sc.nextLine();
		}
		// in danh sach vua nhap
		for (int i = 0; i < arr.length; i++) {
			Person p = arr[i];
			System.out.format("Ten: %S - Tuoi: %d ",p.name,p.old);
		}
		Person max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(max.old < arr[i].old)
				max = arr[i];
		}
		System.out.format( "Ten: %S - Tuoi: %d " ,max.name,max.old);
		System.out.println("Nguoi lon tuoi nhat la: " + max.old);
		System.out.println("Ten nguoi lon tuoi nhat la :" + max.name);
	}
}

