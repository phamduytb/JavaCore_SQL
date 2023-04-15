package section12_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

import demo.model.MyException;

// finally trong try catch, dù có đúng hay sai thì vẫn gọi vào finally

public class MainException {

		public static void main(String[] args) {
//			input();
//			System.out.println("End");
			
			try {
//				hello("duy");
				hello(null);
			} catch (MyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// throw trả về exception,  throws loại exception trả về
		// Try, cath bắt exception
		
		public static void hello(String name) throws MyException{
			if (name == null) {
				MyException exception = new MyException();
				exception.setCode(100);
				throw exception; //throw Tương tự return ( trả về exception)
			} else {
				System.out.println("Hello " + name);
			}
		}

		private static void input() {
			while (true) {
				try {
					System.out.println("Enter number n: ");
					int n = new Scanner(System.in).nextInt();
					System.out.println(n);
					break;
				}catch (InputMismatchException e) {
					System.out.println("Invalid");
				} catch (Exception e) {
					// log : Nên lưu lại lỗi vào file nào đó (log file)
					//printStackTrace in lỗi (in lỗi để mình nhìn, người dùng không cần biết)
					e.printStackTrace();
					System.out.println("Erro!");
				}
			}
			
				
		}
}
