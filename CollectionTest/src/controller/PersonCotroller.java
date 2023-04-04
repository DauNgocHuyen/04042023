package controller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import model.PersonModel;

public class PersonCotroller implements PersonControllerInterface{
	Scanner sc = new Scanner(System.in);
	List<PersonModel> list = new ArrayList<>();
	
	@Override
	public void them() {
		PersonModel pm = new PersonModel();
		System.out.println("Nhap cac thong tin cua doi tuong");
		System.out.println("Ten: ");
		String name = sc.nextLine();
		System.out.println("Tuoi: ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.println("Dia chi: ");
		String address = sc.nextLine();
		pm.setName(name);
		pm.setAge(age);
		pm.setAddress(address);
		list.add(pm);
		System.out.println("Da them thanh cong");
	}
	@Override
	public void xoa() {
		System.out.println("Nhap ten nguoi can xoa");
		String nameDelete = sc.nextLine();
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals(nameDelete)) {
				list.remove(i);
			}
		}
		System.out.println("Da xoa thanh cong");
	}
	@Override
	public void timKiem() {
		int ok = 0;
		System.out.println("Nhap ten nguoi muon tim kiem");
		String nameSearch = sc.nextLine();
		for(PersonModel i : list) {
			if(i.getName().equals(nameSearch)) {
				ok = 1;
				System.out.println(i.toString());
			}
		}
		if(ok == 0) {
			System.out.println("Khong ton tai nguoi nay trong danh sach");
		}
		
	}
	@Override
	public void in() {
		System.out.println("Danh sach: ");
		for(PersonModel i : list) {
			System.out.println(i.toString());
		}
		
	}
	public void doHieuSuat() {
		int[] arr = new int[1000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        long startTime = System.currentTimeMillis();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list1.add(arr[i]);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Thoi gian thuc thi cua ArrayList: " + (endTime - startTime));
        startTime = System.currentTimeMillis();
        LinkedList<Integer> list2 = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            list2.add(arr[i]);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Thoi gian thuc thi cua LinkedList: " + (endTime - startTime));
    }

}
