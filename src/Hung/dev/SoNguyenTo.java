package Hung.dev;
import java.util.Scanner;
public class SoNguyenTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so n: ");
		n = scanner.nextInt();
		if(n>0)	{
			if(n==1)
			   System.out.println(n+ " La so nguyen to");
		    else
		    	System.out.println(n+ " khong phai la so nguyen to");

		}
		
	}
	public static int kiemtrasonguyento(int n) {
		int dem = 0;
		for(int i=1;i<=n ; i++) {
			if(n%i==0)
				dem++;
		}
		if(dem==2)
			return 1;
		else return 0;
				
	}
}


