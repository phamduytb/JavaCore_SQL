package phanLoaiSim;

import java.util.Scanner;

public class PhanLoaiSim {
	static boolean ktSim = true;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while( true) {
			boolean check = true;
			System.out.println("----------------Menu-------------");
			System.out.println("1. Nhập số điện thoại ");
			System.out.println("2. Thoát");
			System.out.println("Lựa chọn của bạn là: ");
			int choice = Integer.parseInt(sc.nextLine());
//			sc.nextLine();
			switch(choice) {
				case 1:
					ktSim = true;
					System.out.println("Mời bạn nhập số điện thoại: ");
					String phone = sc.nextLine();
					if(ktHopLe(phone)) {

						ktNhaMang(phone);
						if (ktSim) {
							phanLoaiSim(phone);
						}
//						
					} else {
						System.out.println("Số điện thoại không hợp lệ");
					}
					
					break;
				case 2: 
					System.out.println("------------Kết thúc------");
					check = false;
					break;
				default:
					System.out.println("Chỉ lựa chon 1 hoặc 2");
			}
			if (check == false) {
				break;
			}
		}
	}

	private static void phanLoaiSim(String phone) {
		String lucQuy = "^[0-9]{4}1{6}$|^[0-9]{4}2{6}$|^[0-9]{4}9{6}$|^[0-9]{4}3{6}$|^[0-9]{4}4{6}$|^[0-9]{4}5{6}$|^[0-9]{4}6{6}$|"
				+ "^[0-9]{4}7{6}$|";
//		String tamHoa = "^[0-9]{7}";
		
		if(phone.matches(lucQuy)) {
			System.out.println("Đây là sim lục quý");
		} else {
			System.out.println("Các loại sim khác");
		}
	}

	private static void ktNhaMang(String phone) {
		String regexVietTel = "^03[2|3|4|5|6|7|8|9][0-9]{7}$|^086[0-9]{7}$|^09[6|7|8][0-9]{7}$";

		String regexVinaphone = "^08[1-5]{1}[0-9]{7}$|^088[0-9]{7}$|^09[1|4][0-9]{7}$]";
		if (phone.matches(regexVietTel)) {
			System.out.println("Số điện thoại thuộc nhà mạng VietTel");
		} else if (phone.matches(regexVinaphone)) {
			System.out.println("Số điện thoại thuộc nhà mạng Vinaphone");
		} else {
			System.out.println("Số điện thoại không hợp lệ");
			ktSim = false;
		}
		
	}

	private static boolean ktHopLe(String phone) {
		String regex = "[0-9]{10}";
		if (phone.matches(regex)) {
			return true;
		}
		return false;
	}
}
