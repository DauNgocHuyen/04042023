package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controller.PersonCotroller;
import model.PersonModel;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PersonCotroller pc = new PersonCotroller();
		while(true) {
			System.out.println("Nhap yeu cau cua ban");
			System.out.println("1.Them");
			System.out.println("2.In ra man hinh");
			System.out.println("3.Xoa");
			System.out.println("4.Tim kiem");
			System.out.println("5.Do hieu suat");
			System.out.println("0.Thoat");
			int n = Integer.parseInt(sc.nextLine());
			switch (n) {
				case 1: 
					pc.them();
					break;
				case 2: 
					pc.in();
					break;	
				case 3: 
					pc.xoa();
					break;
				case 4: 
					pc.timKiem();
					break;
				case 5:
					pc.doHieuSuat();
					break;
				case 0:
					System.exit(0);
			}
			
		}
		
	}

}
