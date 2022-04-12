package Bai1;

public class PhanLoaiDoTuoi {
	public static void main(String[] args) {
		phanLoaiTuoi(41);
	}
	
	public static void phanLoaiTuoi(double a) {
		if (a > 0) {
			if (a < 1) {
				System.out.println("Tre so sinh");
			} else if (a == 1 && a <= 3) {
				System.out.println("Em be");
			} else if (a > 3 && a < 18) {
				System.out.println("Tre em");
			} else if (a >= 18 && a <= 40) {
				System.out.println("Nguoi lon");
			} else if (a > 40 && a < 60) {
				System.out.println("Trung nien");
			} else if (a >= 60 && a <= 100) {
				System.out.println("Nguoi gia");
			} else if (a > 100) {
				System.out.println("Nguoi sieu gia");
			}
		} else System.out.println("So tuoi khong hop le");
	}
}
