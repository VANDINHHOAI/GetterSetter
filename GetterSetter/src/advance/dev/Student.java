package advance.dev;

public class Student {
	private String name;
	private int age;
	private String address;
	private int phone;
	private double dtb;
	
	
	public Student(String name, int age, String address, int phone, double dtb) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
		this.dtb = dtb;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		}else {
			System.out.println("Tuoi khong hop le!");
		}
		
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public double getDtb() {
		return dtb;
	}
	public void setDtb(double dtb) {
		if (dtb >= 0 ) {
			this.dtb = dtb;
		}else {
			System.out.println("Diem trung binh khong hop le!");
		}
		
	}
}
