package main;

import java.util.Scanner;

import hyungseok.hyungseok_method;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		hyungseok_method hs = new hyungseok_method();
		while(true) {
			System.out.println("1.박선영 2.박상진 3.문지은 4.김형석 5.김여진");
			num = sc.nextInt();
			switch(num) {
			case 1: break;
			case 2: break;
			case 3: break;
			case 4: 
				hs.hs_print();
				break;
			case 5: break;
			}
		}
	}
}
