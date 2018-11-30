package Hung.dev;
import java.util.Scanner;
public class PhuongTrinhBacHai {

	private static Scanner scanner = new Scanner(System.in);;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhap so bac 2, a");
		float a = PhuongTrinhBacHai.scanner.nextFloat() ;
		System.out.println("Nhap so bac 1, b");
		float b = PhuongTrinhBacHai.scanner.nextFloat() ;
		System.out.println("Nhap so tu do, c");
		float c = scanner.nextFloat();
		PhuongTrinhBacHai.GPT(a , b, c);
		
		

	}

	private static void GPT(float a, float b, float c) {
		if(a==0) {
			if(b==0) {
				System.out.println("PTVN");
			}
			else {
				System.out.println("Phuong trinh co 1 nghiem" + "x =" +(-c/b));
			}
			return;
		}
		float delta = b*b - 4*a*c;
		float x1;
		float x2;
		if(delta<0) {
			System.out.println("PTVN");
		}
		else if(delta==0) {
			System.out.println("Phuong trinh co nghiem duy nhat" + "x=" + (-b/(2*a)));
		}
		else {
			x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);

		}
		
	}

}
