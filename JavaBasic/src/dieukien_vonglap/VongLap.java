package dieukien_vonglap;

public class VongLap {
	public static void main(String[] args) {
		//---------------while----------
//		int i = 0;
//		while (i < 10 && i != 4) {
//			System.out.println("Hello");
//			i += 2;
//		}
		
		bangCuuChuong();
		
		
		
		//-------do-while---------//
		
		
		//----for----------------//
	}
	
	public static void bangCuuChuong() {
		int i = 0;
		while (i < 10) {
			int j = 0;
			while (j < 10) {
				System.out.print(i+ "x" + j + " = " + (i * j) + " ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
	
	public static void giaiThua(int n) {
		if (n < 0) {
			System.out.println("Dữ liệu không hợp lệ");
		} else if (n == 0) {
			System.out.println("GT = 1");
		} else {
			int i = 1;
			int kq = 1;
			while (i <= n) {
				kq *=i;
				i++;
			}
			System.out.println(kq);
		}
	}
}
