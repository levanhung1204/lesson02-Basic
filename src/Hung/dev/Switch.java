package Hung.dev;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1 ;
		Scanner scanner = new Scanner (System.in);
		System.out.println("Nhap vao so tu 1 den 10");
		n = scanner.nextInt();
		
		
		switch(n) {
		case 1: 
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
		case 7:
			System.out.println("Seven");
			break;
		case 8:
			System.out.println("Eight");
			break;
		case 9:
			System.out.println("Nine");
			break;
		case 10 :
			System.out.println("Ten");
			break;
		default:
			System.out.println("Ban nhap lo roi");
		}

	}

}
