package Hung.dev;
import java.util.Scanner;
public class TinhGiaiThua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap gia tri n");
		n = sc.nextInt();
		giaiThua(n);
	}
	public static void giaiThua(int n) {
		int ketqua = 1;
		for(int i = 1 ; i <= n ; i++) ketqua = ketqua * i ;
		System.out.println("Giai thua la i =" + ketqua);
	}

}
