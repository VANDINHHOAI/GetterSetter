package advance.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] std = new Student[3];
		
		input(std);
		print(std);
	}

	private static void print(Student[] std) {
		// TODO Auto-generated method stub
		System.out.println("Danh sach sinh vien da nhap:");
		for (int i = 0; i < std.length; i++) {
			System.out.println("Ten: " + std[i].getName());
			System.out.println("Tuoi: " + std[i].getAge());
			System.out.println("Dia chi: " + std[i].getAddress());
			System.out.println("So dien thoai: " + std[i].getPhone());
			System.out.println("Dien trung binh: " + std[i].getDtb());
			System.out.println("=========================");
		}
	}

	private static void input(Student[] std) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < std.length; i++) {
			System.out.println("Nhap ten sinh vien thu " + (i + 1) + ": ");
			String name = sc.nextLine();
			System.out.println("Nhap tuoi sinh vien thu " + (i + 1) + ": ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.println("Nhap dia chi sinh vien thu " + (i + 1) + ": ");
			String address = sc.nextLine();
			System.out.println("Nhap so dien thoai sinh vien thu " + (i + 1) + ": ");
			int phone = sc.nextInt();
			sc.nextLine();
			System.out.println("Nhap diem trung binh sinh vien thu " + (i + 1) + ": ");
			double dtb = sc.nextDouble();
			sc.nextLine();
			std[i] = new Student(name, age, address, phone, dtb);
		}
	}
}


